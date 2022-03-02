package com.google.android.gms.audiomodem;

import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class DecodedTokensProtoHelper {
    private final List tokens = new ArrayList();

    /* access modifiers changed from: package-private */
    public void addToken(byte[] bArr) {
        this.tokens.add(bArr);
    }

    public avos build() {
        aucd o = avos.b.o();
        for (int i = 0; i < this.tokens.size(); i++) {
            aucd o2 = avor.c.o();
            auay a = auay.a((byte[]) this.tokens.get(i));
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avor avor = (avor) o2.b;
            a.getClass();
            avor.a |= 1;
            avor.b = a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avos avos = (avos) o.b;
            avor avor2 = (avor) o2.i();
            avor2.getClass();
            if (!avos.a.a()) {
                avos.a = aucj.a(avos.a);
            }
            avos.a.add(avor2);
        }
        return (avos) o.i();
    }
}
