package defpackage;

/* renamed from: aqas  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqas implements aqay {
    private final apyi a;

    public aqas(apyi apyi) {
        this.a = apyi;
    }

    public final aqcb a(aqau aqau) {
        azxh azxh = aqau.b;
        amrl.b(true, (Object) "Cronet does not support CallOptions.withAuthority(). See https://github.com/grpc/grpc-java/issues/1767");
        apyg apyg = (apyg) azxh.a(apyg.a);
        if (apyg == null) {
            String str = aqau.c.b;
            apyg = this.a.a(str);
            amrl.a((Object) apyg, "Could not find RpcId for method %s.Is portable_proto_filter set in your android_rpc_service?", (Object) str);
            azxh = azxh.a(apyg.a, (Object) apyg);
        }
        return aqcb.a(azxh.a(aekx.a, (Object) apyg.a()));
    }

    public final aqcc c() {
        return aqcc.a;
    }

    public final aqcb b() {
        return aqcb.a;
    }

    public final aqcb b(aqau aqau) {
        return aqcb.a;
    }

    public final aqcb a(aqav aqav) {
        return aqcb.a;
    }

    public final aqcc a(aqat aqat) {
        return aqcc.a;
    }

    public final aqcc a(aqaw aqaw) {
        return aqcc.a;
    }
}
