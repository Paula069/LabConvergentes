package co.edu.unipiloto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView list = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.Color);
        String prodType = String.valueOf(color.getSelectedItemId());

        if (prodType.equals("0")) {
        }

        if (prodType.equals("1")) {
            String temp = "1. Presupuesto personal" +
                    "\n2. Planificacion financiera personal" +
                    "\n3. Monitoreo de gastos y ahorros" +
                    "\n4. Asesoramiento Financiero en linea";
            list.setText(temp);
        }
        if (prodType.equals("2")) {
            String temp = "1. Asesoramiento de inversiones" +
                    "\n2. Estrategias de inversion" +
                    "\n3. Inversion en activos alternativos" +
                    "\n4. Analisis de portafolio de inversion";
            list.setText(temp);
        }
        if (prodType.equals("3")) {
            String temp = "1. Reintroducción de Especies en Peligro de Extinción" +
                    "\n2. Protección de Hábitats Críticos" +
                    "\n3. Conservación de Especies Marinas" +
                    "\n4. Sensibilización sobre la Fauna Loca";
            list.setText(temp);
        }
        if (prodType.equals("4")) {
            String temp = "1. Sistemas de Transporte Eléctrico" +
                    "\n2. Rutas de Transporte No Motorizado" +
                    "\n3. Reducción de Emisiones en el Transporte Público" +
                    "\n4. Rutas de Transporte para Reducción de Congestión" +
                    "\n5. Carga para Vehículos Eléctricos";
            list.setText(temp);
        }
        if (prodType.equals("5")) {
            String temp = "1. Sistemas de Defensa" +
                    "\n2. Ciberseguridad Nacional" +
                    "\n3. Mantenimiento de Equipamiento Militar" +
                    "\n4. Capacitación de Fuerzas Armadas" +
                    "\n5. Inteligencia y Contrainteligencia";
            list.setText(temp);
        }
        if (prodType.equals("6")) {
            String temp = "1.  Museos y Galerías de Arte" +
                    "\n2. Centros Culturales y Comunitarios" +
                    "\n3. Parques Temáticos y de Diversiones" +
                    "\n4. Festivales y Eventos Culturales" +
                    "\n5. Monumentos Históricos" +
                    "\n6. Instalaciones Deportivas y Recreativas";
            list.setText(temp);
        }
        if (prodType.equals("7")) {
            String temp = "1. Semáforos Inteligentes" +
                    "\n2. Centros de Control de Tráfico" +
                    "\n3. Sistemas de Monitoreo y Gestión de Congestión" +
                    "\n4. Sistemas de Información al Viajero" +
                    "\n5. Señalización Dinámica";
            list.setText(temp);
        }
    }
}