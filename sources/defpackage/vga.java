package defpackage;

import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: vga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vga extends arwm {
    final /* synthetic */ UnsubscribeRequest a;
    final /* synthetic */ vgh b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vga(vgh vgh, String str, UnsubscribeRequest unsubscribeRequest) {
        super(str);
        this.b = vgh;
        this.a = unsubscribeRequest;
    }

    public final void run() {
        this.b.a(this.a.i).a(this.a);
    }
}
