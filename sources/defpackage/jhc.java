package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.WorkSource;

/* renamed from: jhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class jhc extends jgy {
    private static int d = 0;

    public jhc(Context context, jbs jbs) {
        super(context, jbs);
    }

    public static synchronized String a(String str) {
        String sb;
        synchronized (jhc.class) {
            int i = d + 1;
            d = i;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 18);
            sb2.append(str);
            sb2.append("_ALARM_");
            sb2.append(i);
            sb = sb2.toString();
        }
        return sb;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ jgx a(jgw jgw, String str, int i) {
        return new jha(this, jgw, str, i);
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ void a(String str, int i, long j, jgx jgx, Handler handler, WorkSource workSource) {
        a(str, i, j, (jha) jgx, workSource);
    }

    /* access modifiers changed from: protected */
    public void a(String str, int i, long j, jha jha, WorkSource workSource) {
        this.c.a(str, i, j, jha.e, workSource);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(jgx jgx) {
        this.c.a(((jha) jgx).e);
    }
}
