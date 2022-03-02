package defpackage;

/* renamed from: azyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azyq {
    public String a;
    public azyr b;
    public azzb c;
    private Long d;

    public final azys a() {
        amrl.a((Object) this.a, (Object) "description");
        amrl.a((Object) this.b, (Object) "severity");
        amrl.a((Object) this.d, (Object) "timestampNanos");
        amrl.b(true, (Object) "at least one of channelRef and subchannelRef must be null");
        return new azys(this.a, this.b, this.d.longValue(), this.c);
    }

    public final void a(long j) {
        this.d = Long.valueOf(j);
    }
}
