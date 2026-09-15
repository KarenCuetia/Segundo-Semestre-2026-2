package tareasemana2;

public class MainCuentaBancaria {
        public static void main(String[] args) {
         
        //creacion del objeto de la clase de cuenta bancaria
          CuentaBancaria  objCuentaBancaria1  = new CuentaBancaria();
          CuentaBancaria objCuentaBancaria2 = new CuentaBancaria();

          objCuentaBancaria1 .titular = "Daniela Ramirez";
          objCuentaBancaria1 .numeroCuenta = "09853401081";
          objCuentaBancaria1  .saldo = 35800000;

          objCuentaBancaria2 .titular = "Milania Torres";
          objCuentaBancaria2  .numeroCuenta = "19824376530";
          objCuentaBancaria2  .saldo = 56000087;

          objCuentaBancaria1 .mostrarInformacio();
          objCuentaBancaria2 .mostrarInformacio();







        
    }
    

    
}
