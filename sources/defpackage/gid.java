package defpackage;

import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;

/* renamed from: gid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class gid implements acvp {
    private final gif a;

    public gid(gif gif) {
        this.a = gif;
    }

    public final void a(acwa acwa) {
        gif gif = this.a;
        gif.a = true;
        if (acwa.b()) {
            gif.b = ((ManagedAccountSetupInfo) acwa.d()).c;
        }
        gif.a();
    }
}
