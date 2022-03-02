package com.android.volley.toolbox;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class HttpResponse {
    private final int a;
    private final List b;
    private final int c;
    private final InputStream d;

    public HttpResponse(int i, List list) {
        this(i, list, -1, (InputStream) null);
    }

    public final InputStream getContent() {
        return this.d;
    }

    public final int getContentLength() {
        return this.c;
    }

    public final List getHeaders() {
        return Collections.unmodifiableList(this.b);
    }

    public final int getStatusCode() {
        return this.a;
    }

    public HttpResponse(int i, List list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
    }
}
