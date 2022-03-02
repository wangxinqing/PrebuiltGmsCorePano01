package defpackage;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.ArrayList;

/* renamed from: jhi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jhi implements Response.Listener, Response.ErrorListener {
    public final ArrayList a;
    private VolleyError b;
    private final jhi c;

    public jhi() {
        this((jhi) null);
    }

    public static jhi a() {
        return new jhi();
    }

    public final jhi b() {
        return new jhi(this);
    }

    public final void c() {
        VolleyError volleyError = this.b;
        if (volleyError != null) {
            throw volleyError;
        }
    }

    public final boolean d() {
        return this.a.size() > 0;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        jhi jhi = this.c;
        if (jhi != null) {
            jhi.onErrorResponse(volleyError);
        }
        this.b = volleyError;
    }

    private jhi(jhi jhi) {
        this.a = new ArrayList();
        this.c = jhi;
    }

    public final jag a(int i) {
        return (jag) this.a.get(i);
    }

    /* renamed from: a */
    public void onResponse(jag jag) {
        this.a.add(jag);
    }
}
