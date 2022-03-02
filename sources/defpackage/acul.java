package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: acul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acul extends acum {
    final /* synthetic */ String a;
    final /* synthetic */ avxb[] b;
    final /* synthetic */ avwu c;

    public acul(avwu avwu, avxb[] avxbArr, String str) {
        this.c = avwu;
        this.b = avxbArr;
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        avxb[] avxbArr = this.b;
        avwu avwu = this.c;
        String str2 = this.a;
        InputStream a2 = ((acux) avwu.a).a(new acuu(), str2, str);
        if (a2 != null) {
            avxbArr[0] = avxg.a(avxe.class, a2);
            return;
        }
        throw new IOException("Unable to access feed.");
    }
}
