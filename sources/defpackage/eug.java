package defpackage;

import android.net.Uri;
import com.google.android.gms.auth.api.credentials.Credential;
import java.util.List;

/* renamed from: eug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eug {
    public String a;
    public Uri b;
    public List c;
    public String d;
    public String e;
    public String f;
    public String g;
    private final String h;

    public eug(Credential credential) {
        this.h = credential.a;
        this.a = credential.b;
        this.b = credential.c;
        this.c = credential.d;
        this.d = credential.e;
        this.e = credential.f;
        this.f = credential.g;
        this.g = credential.h;
    }

    public final Credential a() {
        return new Credential(this.h, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public eug(String str) {
        this.h = str;
    }
}
