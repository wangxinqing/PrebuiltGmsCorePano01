package defpackage;

import com.google.android.gms.drive.internal.model.File;
import org.json.JSONObject;

/* renamed from: lbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lbc {
    private final boolean a;
    public final kyq b;
    public final lcv c;

    public lbc(kyq kyq, boolean z, lcv lcv) {
        iva.a((Object) kyq, (Object) "field");
        this.b = kyq;
        this.a = z;
        this.c = lcv;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(kmp kmp, String str);

    /* access modifiers changed from: protected */
    public Object a(kmp kmp, String str, Object obj) {
        return a(kmp, str);
    }

    /* access modifiers changed from: protected */
    public abstract Object a(JSONObject jSONObject);

    public abstract String a(Object obj);

    /* access modifiers changed from: protected */
    public abstract void a(File file, Object obj);

    /* access modifiers changed from: protected */
    public abstract void a(kmp kmp, String str, Object obj, long j);

    /* access modifiers changed from: protected */
    public void a(kmp kmp, knl knl, long j) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(JSONObject jSONObject, Object obj);

    public String b(Object obj) {
        if (this.a) {
            return this.b.a();
        }
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("Field ");
        sb.append(valueOf);
        sb.append(" cannot be read directly from the database.");
        throw new UnsupportedOperationException(sb.toString());
    }

    public abstract String b(Object obj, String str);
}
