package net.skhu.feederpetedit;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;

public class ReservRequest extends StringRequest {
    final static private String URL = "http://zc753951.cafe24.com/reservationRegister.php";
    private Map<String, String> parameters;

    public ReservRequest(String userID, int h, int m, int resAmount, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        String resTime = h+":"+m;
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("resTime", resTime);
        parameters.put("resAmount", resAmount+"");

    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}


