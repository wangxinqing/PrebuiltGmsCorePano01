package com.android.volley.toolbox;

import com.android.volley.Request;
import java.util.Map;
import org.apache.http.HttpResponse;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface HttpStack {
    HttpResponse performRequest(Request request, Map map);
}
