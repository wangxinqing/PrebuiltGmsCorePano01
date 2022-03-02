package com.android.volley;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ParseError extends VolleyError {
    public ParseError() {
    }

    public ParseError(NetworkResponse networkResponse) {
        super(networkResponse);
    }

    public ParseError(Throwable th) {
        super(th);
    }
}
