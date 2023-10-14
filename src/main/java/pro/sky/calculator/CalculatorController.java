package pro.sky.calculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public boolean RequestParam;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return "<b> Добро пожаловать в калькулятор! </b>";
    }

    @RequestMapping(path = "/plus")
    public String calculatingPlus(@RequestParam(value = "num1", required = false) int num1, @RequestParam (value = "num2",required = false) int num2) {
           return num1 + " + " + num2 + " = " + calculatorService.calculatingPlus(num1, num2);
        }


    @RequestMapping(path = "/minus")
    public String calculatingMinus(@RequestParam(value = "num1", required = false) int num1,@RequestParam(value = "num2", required = false) int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.calculatingMinus(num1,num2);    }


    @RequestMapping(path = "/multiply")
    public String calculatingMultiply(@RequestParam(value = "num1", required = false) int num1, @RequestParam(value = "num2", required = false) int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.calculatingMultiply(num1,num2);    }


    @RequestMapping(path = "/divide")
    public String calculatingDivide(@RequestParam(value = "num1", required = false) int num1, @RequestParam (value = "num2", required = false) int num2) {
        return num1 + " / " + num2 + " = " + calculatorService.calculatingDivide(num1,num2);
    }

}