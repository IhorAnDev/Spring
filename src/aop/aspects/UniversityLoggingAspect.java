package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
/*    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: logiruem poluchenie " +
                "spiska studentov pered methodom getStudents");
    }*/

   /* @AfterReturning(pointcut = "execution(* getStudents())"
            , returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudents = students.get(0);

        String nameSurname = firstStudents.getNameSurname();
        nameSurname = "Mister " + nameSurname;
        firstStudents.setNameSurname(nameSurname);

        double avgGrade = firstStudents.getAvgGrade();
        avgGrade = 3.4 + avgGrade;
        firstStudents.setAvgGrade(avgGrade);

        System.out.println("afterReturningGetStudentsLoggingAdvice: logiruem poluchenie " +
                "spiska studentov posle raboti methoda getStudents");
    }*/

    /*  @AfterThrowing(pointcut = "execution(* getStudents())"
              , throwing = "exception")
      public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
          System.out.println("afterThrowingGetStudentsLoggingAdvice: logiruem vibros iskluchenia "
                  + exception);
      }*/
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: loggiruem normalnoe okoncanie methoda" +
                "ili iskluchenie ");
    }
}
