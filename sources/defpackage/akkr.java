package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: akkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akkr extends akko {
    private final akkn a;

    public akkr(akkn akkn) {
        this.a = akkn;
    }

    public final /* bridge */ /* synthetic */ int a(Object obj) {
        Long l = (Long) obj;
        return 8;
    }

    public final /* bridge */ /* synthetic */ int b(Object obj) {
        astz astz = (astz) obj;
        int i = astz.U;
        if (i == -1) {
            i = aueh.a.a((Object) astz).b(astz);
            astz.U = i;
        }
        return akkn.a(i) + 4;
    }

    /* renamed from: c */
    public final astz b(aubc aubc) {
        try {
            aubc a2 = aubc.a(this.a.b(aubc.e(aubc.h())));
            aucd o = astz.o.o();
            o.a(a2);
            return (astz) o.i();
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Failed to read value");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }

    public final /* bridge */ /* synthetic */ Object a(aubc aubc) {
        return Long.valueOf(aubc.g());
    }

    /* renamed from: a */
    public final void b(astz astz, aubk aubk) {
        int i = astz.U;
        if (i == -1) {
            i = aueh.a.a((Object) astz).b(astz);
            astz.U = i;
        }
        byte[] bArr = new byte[i];
        astz.a(aubk.a(bArr));
        try {
            byte[] a2 = this.a.a(bArr);
            aubk.e(a2.length);
            aubk.b(a2);
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Failed to write value");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, aubk aubk) {
        aubk.d(((Long) obj).longValue());
    }
}
