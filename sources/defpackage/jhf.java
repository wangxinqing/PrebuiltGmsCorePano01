package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.WorkSource;

/* renamed from: jhf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jhf extends jgy {
    public jhf(Context context, jbs jbs) {
        super(context, jbs);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ jgx a(jgw jgw, String str, int i) {
        return new jhe(this, jgw, str, i);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(String str, int i, long j, jgx jgx, Handler handler, WorkSource workSource) {
        String str2 = str;
        int i2 = i;
        long j2 = j;
        this.c.a(str2, i2, j2, jbs.a, ((jhe) jgx).e, handler, workSource);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(jgx jgx) {
        this.c.a(((jhe) jgx).e);
    }
}
