package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;

/* renamed from: acuk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acuk extends acum {
    final /* synthetic */ avxe a;
    final /* synthetic */ avwu b;

    public acuk(avwu avwu, avxe avxe) {
        this.b = avwu;
        this.a = avxe;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        avwu avwu = this.b;
        String str2 = this.a.c;
        avwt avwt = avwu.a;
        if (!avwy.a(str2)) {
            InputStream a2 = ((acux) avwt).a(new acuw("DELETE", (HttpEntity) null), str2, str);
            if (a2 != null) {
                try {
                    a2.close();
                } catch (IOException e) {
                }
            } else {
                throw new IOException("Unable to delete entry.");
            }
        } else {
            throw new IllegalArgumentException("you must specify an non-empty edit url");
        }
    }
}
