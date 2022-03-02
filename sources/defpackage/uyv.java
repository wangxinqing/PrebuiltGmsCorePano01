package defpackage;

/* renamed from: uyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyv {
    public vay a;
    private final uxu b;

    public uyv(uxu uxu) {
        this.b = uxu;
    }

    public final void a(avch avch) {
        jjg jjg = tgc.a;
        vgu.a(avch);
        this.b.a(avch);
    }

    public final void a(avch avch, vgo vgo) {
        vgq vgq;
        uxu uxu = this.b;
        uyu uyu = new uyu(this, avch, vgo);
        uxu.e.b();
        vgq vgq2 = (vgq) uxu.b.get(avch.k);
        if (vgq2 != null) {
            if (vgq2.a(vgo)) {
                jjg jjg = tgc.a;
                vgo.a();
                vgu.a(avch);
                uyu.run();
                return;
            }
            uxu.a(avch);
        }
        ased a2 = uxu.a();
        if (a2 == null) {
            ((anih) ((anih) tgc.a.b()).a("uxu", "a", 155, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to start advertising without live NearbyDirect");
            return;
        }
        asgb asgb = asgb.OPERATION_STATUS_UNKNOWN;
        avch avch2 = avch.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = avch.ordinal();
        if (ordinal == 1) {
            vgq = uxu.f.c;
        } else if (ordinal == 2 || ordinal == 3) {
            vgq = new uxp(uxu, uxu.d, a2, avch, uyu);
        } else if (ordinal != 8) {
            String a3 = vgu.a(avch);
            throw new IllegalStateException(a3.length() == 0 ? new String("Unknown Medium requested: ") : "Unknown Medium requested: ".concat(a3));
        } else {
            vgq = uxu.f.a;
        }
        if (!vgq.a()) {
            jjg jjg2 = tgc.a;
            String a4 = vgu.a(avch);
            String valueOf = String.valueOf(vgq);
            String valueOf2 = String.valueOf(Boolean.valueOf(vgq.a()));
            StringBuilder sb = new StringBuilder(a4.length() + 29 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
            sb.append(a4);
            sb.append(" advertiser: ");
            sb.append(valueOf);
            sb.append(" can advertise: ");
            sb.append(valueOf2);
            sb.toString();
            return;
        }
        uxu.e.b();
        if (!vgq.a()) {
            ((anih) ((anih) tgc.a.b()).a("uxu", "a", 201, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s is not supported to advertise", (Object) vgu.a(avch));
        } else {
            uxu.b.put(avch.k, vgq);
            try {
                jjg jjg3 = tgc.a;
                vgo.a.a();
                vgu.a(avch);
                vgq.b(vgo);
            } catch (vgp e) {
                anih anih = (anih) tgc.a.b();
                anih.a((Throwable) e);
                ((anih) anih.a("uxu", "a", 213, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fail to start advertising: %s", (Object) vgu.a(avch));
            }
        }
        if (avch == avch.AUDIO_ULTRASOUND_PASSBAND || avch == avch.AUDIO_AUDIBLE_DTMF) {
            uyu.run();
        }
    }
}
