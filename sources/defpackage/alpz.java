package defpackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: alpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alpz {
    private static final Logger a = Logger.getLogger("BrowserChannel");
    private final StringBuilder b = new StringBuilder();
    private int c;
    private final Queue d = new LinkedList();
    private int e = 1;

    /* access modifiers changed from: package-private */
    public final synchronized alpy a() {
        return (alpy) this.d.poll();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int i3 = this.e;
            if (i3 == 1) {
                char charAt = charSequence.charAt(i);
                if (charAt == 10) {
                    String trim = this.b.toString().trim();
                    try {
                        int parseInt = Integer.parseInt(trim);
                        this.c = parseInt;
                        if (parseInt <= 0) {
                            Logger logger = a;
                            Level level = Level.WARNING;
                            int i4 = this.c;
                            StringBuilder sb = new StringBuilder(35);
                            sb.append("Ignored invalid length: ");
                            sb.append(i4);
                            logger.logp(level, "com.google.apps.brix.api.client.net.browserchannel.bind.EnvelopeBuffer", "handleData", sb.toString());
                        } else {
                            this.e = 2;
                        }
                    } catch (NumberFormatException e2) {
                        Logger logger2 = a;
                        Level level2 = Level.WARNING;
                        String valueOf = String.valueOf(trim);
                        logger2.logp(level2, "com.google.apps.brix.api.client.net.browserchannel.bind.EnvelopeBuffer", "handleData", valueOf.length() == 0 ? new String("Ignored non-numeric length value: ") : "Ignored non-numeric length value: ".concat(valueOf));
                    }
                    this.b.setLength(0);
                } else {
                    this.b.append(charAt);
                }
            } else if (i3 == 2) {
                int min = Math.min((this.c + i) - this.b.length(), charSequence.length());
                this.b.append(charSequence, i, min);
                i = min - 1;
                if (this.b.length() == this.c) {
                    try {
                        alze alze = new alze(this.b.toString());
                        alze.c();
                        while (alze.a) {
                            this.d.add(alpy.a(alze));
                        }
                        alze.d();
                    } catch (alry | IllegalArgumentException | IllegalStateException e3) {
                        Logger logger3 = a;
                        Level level3 = Level.WARNING;
                        String valueOf2 = String.valueOf(e3);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                        sb2.append("Ignored invalid server message: ");
                        sb2.append(valueOf2);
                        logger3.logp(level3, "com.google.apps.brix.api.client.net.browserchannel.bind.EnvelopeBuffer", "handleData", sb2.toString());
                    }
                    this.e = 1;
                    this.b.setLength(0);
                } else {
                    continue;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
