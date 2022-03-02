package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import com.google.android.gms.nearby.messages.debug.DebugPokeChimeraService;

/* renamed from: vax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vax extends qvy {
    final /* synthetic */ DebugPokeChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vax(DebugPokeChimeraService debugPokeChimeraService, String str) {
        super(str);
        this.a = debugPokeChimeraService;
    }

    public final void a(ComponentName componentName) {
        jjg jjg = tgc.a;
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        jjg jjg = tgc.a;
        this.a.a.countDown();
    }
}
