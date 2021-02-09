package com.example.parameters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class STVF9 extends AppCompatActivity {

    private EditText no_obra, nombre_proyecto,
            el_speed, el_roping, max_rpm, inspect_rpm, creep_rpm, relevel_rpm,
            init_dvr, special_dvr, max_floor, chime_point, run_open, fwd_direction, gov_sel,
            tqbias_select, tqbias_delta, tqbias_rdytime, suds_accel, unbral_gain, edecel_accel, motor,
            eld_spdmode, numof_motor,

            torque_limit, dclink_scale, current_scale, input_voltage, eldinput_vol, tgripple_wcc,
            invov_level, ovrspd_level, ovrload_time, suds_acc, carrier_freq, encoder_dir, encoder_type,
            sincos_theta, sin_max, sin_min, cos_max, cos_min, invoc_level, scaledc_volt,

            rs, st, rt, dc_link, rfe, sfe, tfe,

             motor_select, motor_cap, mot_ratv, mot_rata, motor_poles, encoder_ppr, wrpm_base, iqse_rate,
            u_angle, motoru_angle, angle_mrt, sig_time, mot_ls, mot_rs, mot_ke, sheave_dia;
    private Button btn_agregar;
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stvf9);

        no_obra = (EditText) findViewById(R.id.et_obra);
        nombre_proyecto = (EditText) findViewById(R.id.et_proyecto);
        el_speed = (EditText) findViewById(R.id.el_speed);
        el_roping = (EditText) findViewById(R.id.el_roping);
        max_rpm = (EditText) findViewById(R.id.max_rpm);
        inspect_rpm = (EditText) findViewById(R.id.inspect_rpm);
        creep_rpm = (EditText) findViewById(R.id.creep_rpm);
        relevel_rpm = (EditText) findViewById(R.id.relevel_rpm);
        init_dvr = (EditText) findViewById(R.id.init_drv);
        special_dvr = (EditText) findViewById(R.id.speciial_drv);
        max_floor = (EditText) findViewById(R.id.max_floor);
        chime_point = (EditText) findViewById(R.id.chime_point);
        run_open = (EditText) findViewById(R.id.run_open);
        fwd_direction = (EditText) findViewById(R.id.fwd_direction);
        gov_sel = (EditText) findViewById(R.id.gov_sel);
        tqbias_select = (EditText) findViewById(R.id.tqbias_select);
        tqbias_delta = (EditText) findViewById(R.id.tqbias_delta);
        tqbias_rdytime = (EditText) findViewById(R.id.tqbias_rdytime);
        suds_accel = (EditText) findViewById(R.id.suds_accel);
        unbral_gain = (EditText) findViewById(R.id.unbral_gain);
        edecel_accel = (EditText) findViewById(R.id.edecel_accel);
        motor = (EditText) findViewById(R.id.motor);
        eld_spdmode = (EditText) findViewById(R.id.eld_spdmode);
        numof_motor = (EditText) findViewById(R.id.numof_motor);
        torque_limit = (EditText) findViewById(R.id.torque_limit);
        dclink_scale = (EditText) findViewById(R.id.dclink_scale);
        current_scale = (EditText) findViewById(R.id.current_scale);
        input_voltage = (EditText) findViewById(R.id.input_voltage);
        eldinput_vol = (EditText) findViewById(R.id.eldinput_vol);
        tgripple_wcc = (EditText) findViewById(R.id.tgripple_wcc);
        invov_level = (EditText) findViewById(R.id.invov_level);
        ovrspd_level = (EditText) findViewById(R.id.ovrspd_level);
        ovrload_time = (EditText) findViewById(R.id.ovrload_time);
        suds_acc = (EditText) findViewById(R.id.suds_acc);
        carrier_freq = (EditText) findViewById(R.id.carrier_freq);
        encoder_dir = (EditText) findViewById(R.id.encoder_dir);
        encoder_type = (EditText) findViewById(R.id.encoder_type);
        sincos_theta = (EditText) findViewById(R.id.sincos_theta);
        sin_max = (EditText) findViewById(R.id.sin_max);
        sin_min = (EditText) findViewById(R.id.sin_min);
        cos_max = (EditText) findViewById(R.id.cos_max);
        cos_min = (EditText) findViewById(R.id.cos_min);
        invoc_level = (EditText) findViewById(R.id.invoc_level);
        scaledc_volt = (EditText) findViewById(R.id.scaledc_volt);
        rs = (EditText) findViewById(R.id.rs);
        st = (EditText) findViewById(R.id.st);
        rt = (EditText) findViewById(R.id.rt);
        dc_link = (EditText) findViewById(R.id.dc_link);
        rfe = (EditText) findViewById(R.id.rfe);
        sfe = (EditText) findViewById(R.id.sfe);
        tfe = (EditText) findViewById(R.id.tfe);
        motor_select = (EditText) findViewById(R.id.motor_select);
        motor_cap = (EditText) findViewById(R.id.motor_cap);
        mot_ratv = (EditText) findViewById(R.id.mot_ratv);
        mot_rata = (EditText) findViewById(R.id.mot_rata);
        motor_poles = (EditText) findViewById(R.id.motor_poles);
        encoder_ppr = (EditText) findViewById(R.id.encoder_ppr);
        wrpm_base = (EditText) findViewById(R.id.wrpm_base);
        iqse_rate = (EditText) findViewById(R.id.iqse_rate);
        u_angle = (EditText) findViewById(R.id.u_angle);
        motoru_angle = (EditText) findViewById(R.id.motoru_angle);
        angle_mrt = (EditText) findViewById(R.id.angle_mrt);
        sig_time = (EditText) findViewById(R.id.sig_time);
        mot_ls = (EditText) findViewById(R.id.mot_ls);
        mot_rs = (EditText) findViewById(R.id.mot_rs);
        mot_ke = (EditText) findViewById(R.id.mot_ke);
        sheave_dia = (EditText) findViewById(R.id.sheave_dia);
        btn_agregar = (Button) findViewById(R.id.btn_agregar);

        btn_agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertar();
            }
        });

    }

    private void insertar(){
        //final ProgressDialog loading =ProgressDialog.show(this,"Por favor espere","Actualizando datos..,", false,false);
        String URL ="http://192.168.0.31/Elevatec_parametros/Insertar_Parametros.php";
        //String URL = "https://elevatecgt.000webhostapp.com/Insertar_Parametros.php";

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //loading.dismiss();
                Toast.makeText(getApplicationContext(), "Datos ingresados", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //loading.dismiss();
                Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros = new HashMap<String,String>();
                parametros.put("no_obra",no_obra.getText().toString());
                parametros.put("nombre_proy",nombre_proyecto.getText().toString());
                parametros.put("el_speed",el_speed.getText().toString());
                parametros.put("el_roping",el_roping.getText().toString());
                parametros.put("max_rpm",max_floor.getText().toString());
                parametros.put("inspect_rpm",inspect_rpm.getText().toString());
                parametros.put("creep_rpm",creep_rpm.getText().toString());
                parametros.put("relevel_rpm",relevel_rpm.getText().toString());
                parametros.put("init_drv",init_dvr.getText().toString());
                parametros.put("special_drv",special_dvr.getText().toString());
                parametros.put("max_floor",max_floor.getText().toString());
                parametros.put("chime_point",chime_point.getText().toString());
                parametros.put("run_open",run_open.getText().toString());
                parametros.put("fwd_direction",fwd_direction.getText().toString());
                parametros.put("gov_sel",gov_sel.getText().toString());
                parametros.put("tqbias_select",tqbias_select.getText().toString());
                parametros.put("tqbias_delta",tqbias_delta.getText().toString());
                parametros.put("tqbias_rdytime",tqbias_rdytime.getText().toString());
                parametros.put("suds_accel",suds_accel.getText().toString());
                parametros.put("unbral_gain",unbral_gain.getText().toString());
                parametros.put("edecel_accel",edecel_accel.getText().toString());
                parametros.put("motor",motor.getText().toString());
                parametros.put("eld_spdmode",eld_spdmode.getText().toString());
                parametros.put("numof_motor",numof_motor.getText().toString());

                parametros.put("torque_limit",torque_limit.getText().toString());
                parametros.put("dclink_scale",dclink_scale.getText().toString());
                parametros.put("current_scale",current_scale.getText().toString());
                parametros.put("input_voltage",input_voltage.getText().toString());
                parametros.put("eldinput_vol",eldinput_vol.getText().toString());
                parametros.put("tgripple_wcc",tgripple_wcc.getText().toString());
                parametros.put("invov_level",invov_level.getText().toString());
                parametros.put("ovrspd_level",ovrspd_level.getText().toString());
                parametros.put("ovrload_time",ovrload_time.getText().toString());
                parametros.put("suds_acc",suds_acc.getText().toString());
                parametros.put("carrier_freq",carrier_freq.getText().toString());
                parametros.put("encoder_dir",encoder_dir.getText().toString());
                parametros.put("encoder_type",encoder_type.getText().toString());
                parametros.put("sincos_theta",sincos_theta.getText().toString());
                parametros.put("sin_max",sin_max.getText().toString());
                parametros.put("sin_min",sin_min.getText().toString());
                parametros.put("cos_max",cos_max.getText().toString());
                parametros.put("cos_min",cos_min.getText().toString());
                parametros.put("invoc_level",invoc_level.getText().toString());
                parametros.put("scaledc_volt",scaledc_volt.getText().toString());

                parametros.put("rs",rs.getText().toString());
                parametros.put("st",st.getText().toString());
                parametros.put("rt",rt.getText().toString());
                parametros.put("dc_link",dc_link.getText().toString());
                parametros.put("rfe",rfe.getText().toString());
                parametros.put("sfe",sfe.getText().toString());
                parametros.put("tfe",tfe.getText().toString());

                parametros.put("motor_select",motor_select.getText().toString());
                parametros.put("motor_cap",motor_cap.getText().toString());
                parametros.put("mot_ratv",mot_ratv.getText().toString());
                parametros.put("mot_rata",mot_rata.getText().toString());
                parametros.put("motor_poles",motor_poles.getText().toString());
                parametros.put("encoder_ppr",encoder_ppr.getText().toString());
                parametros.put("wrpm_base",wrpm_base.getText().toString());
                parametros.put("iqse_rate",iqse_rate.getText().toString());
                parametros.put("u_angle",u_angle.getText().toString());
                parametros.put("motoru_angle",motoru_angle.getText().toString());
                parametros.put("angle_mrt",angle_mrt.getText().toString());
                parametros.put("sig_time",sig_time.getText().toString());
                parametros.put("mot_ls",mot_ls.getText().toString());
                parametros.put("mot_rs",mot_rs.getText().toString());
                parametros.put("mot_ke",mot_ke.getText().toString());
                parametros.put("sheave_dia",sheave_dia.getText().toString());

                no_obra.setText("");
                nombre_proyecto.setText("");
                el_speed.setText("");
                el_roping.setText("");
                max_rpm.setText("");
                inspect_rpm.setText("");
                creep_rpm.setText("");
                relevel_rpm.setText("");
                init_dvr.setText("");
                special_dvr.setText("");
                max_floor.setText("");
                chime_point.setText("");
                run_open.setText("");
                fwd_direction.setText("");
                gov_sel.setText("");
                tqbias_select.setText("");
                tqbias_delta.setText("");
                tqbias_rdytime.setText("");
                suds_accel.setText("");
                unbral_gain.setText("");
                edecel_accel.setText("");
                motor.setText("");
                eld_spdmode.setText("");
                numof_motor.setText("");
                torque_limit.setText("");
                dclink_scale.setText("");
                current_scale.setText("");
                input_voltage.setText("");
                eldinput_vol.setText("");
                tgripple_wcc.setText("");
                invov_level.setText("");
                ovrspd_level.setText("");
                ovrload_time.setText("");
                suds_acc.setText("");
                carrier_freq.setText("");
                encoder_dir.setText("");
                encoder_type.setText("");
                sincos_theta.setText("");
                sin_max.setText("");
                sin_min.setText("");
                cos_max.setText("");
                cos_min.setText("");
                invoc_level.setText("");
                scaledc_volt.setText("");
                rs.setText("");
                st.setText("");
                rt.setText("");
                dc_link.setText("");
                rfe.setText("");
                sfe.setText("");
                tfe.setText("");
                motor_select.setText("");
                motor_cap.setText("");
                mot_ratv.setText("");
                mot_rata.setText("");
                motor_poles.setText("");
                encoder_ppr.setText("");
                wrpm_base.setText("");
                iqse_rate.setText("");
                u_angle.setText("");
                motoru_angle.setText("");
                angle_mrt.setText("");
                sig_time.setText("");
                mot_ls.setText("");
                mot_rs.setText("");
                mot_ke.setText("");
                sheave_dia.setText("");



                return parametros;
            }


        };
        requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }
}

