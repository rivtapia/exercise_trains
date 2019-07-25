package trains.exercise.advices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import trains.exercise.exception.CalculateRoutesException;
import trains.exercise.exception.NoGraphDataException;
import trains.exercise.exception.NoRoutesDataException;

@ControllerAdvice
public class TrainsExceptionController {
   @ExceptionHandler(value = CalculateRoutesException.class)
   public ResponseEntity<Object> exception(CalculateRoutesException exception) {
      return new ResponseEntity<>("Error calculate routes", HttpStatus.INTERNAL_SERVER_ERROR);
   }
   
   @ExceptionHandler(value = NoGraphDataException.class)
   public ResponseEntity<Object> exception(NoGraphDataException exception) {
      return new ResponseEntity<>("Graph data null or empty", HttpStatus.INTERNAL_SERVER_ERROR);
   }
   
   @ExceptionHandler(value = NoRoutesDataException.class)
   public ResponseEntity<Object> exception(NoRoutesDataException exception) {
	   return new ResponseEntity<>("Routes data null or empty", HttpStatus.INTERNAL_SERVER_ERROR);
   }
}
