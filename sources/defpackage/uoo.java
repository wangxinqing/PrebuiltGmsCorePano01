package defpackage;

import com.google.android.gms.mdns.MdnsServiceInfo;

/* renamed from: uoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class uoo implements Runnable {
    private final String a;
    private final MdnsServiceInfo b;
    private final tow c;
    private final uow d;

    public uoo(uow uow, String str, MdnsServiceInfo mdnsServiceInfo, tow tow) {
        this.d = uow;
        this.a = str;
        this.b = mdnsServiceInfo;
        this.c = tow;
    }

    public final void run() {
        uow uow = this.d;
        uow.b.a(this.a, this.b, this.c);
    }
}
