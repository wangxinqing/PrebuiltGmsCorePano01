package defpackage;

import android.os.IInterface;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;

/* renamed from: abxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface abxn extends IInterface {
    void a(int i);

    void a(BootstrapCompletionResult bootstrapCompletionResult);

    void a(TargetConnectionArgs targetConnectionArgs);

    void a(String str);

    boolean a(BootstrapProgressResult bootstrapProgressResult);

    void b();

    void b(String str);

    void c();
}
