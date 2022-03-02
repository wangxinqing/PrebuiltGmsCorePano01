package defpackage;

import com.android.volley.Response;

/* renamed from: aaze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaze implements Response.Listener {
    final /* synthetic */ boolean a;
    final /* synthetic */ aazf b;

    public aaze(aazf aazf, boolean z) {
        this.b = aazf;
        this.a = z;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 1) {
            this.b.e.add(1);
        } else if (num.intValue() != 0) {
            abaa.a("Unexpected result from uploading chunk: %s", num);
            String valueOf = String.valueOf(num);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Unexpected result from uploading chunk: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        } else if (this.a) {
            this.b.e.add(1);
        } else {
            this.b.b();
        }
    }
}
