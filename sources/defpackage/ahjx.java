package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.io.PrintWriter;
import java.util.Collection;

/* renamed from: ahjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahjx extends aicl {
    final /* synthetic */ ActivityRecognitionResult a;
    final /* synthetic */ Collection b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahjx(aico aico, long j, int i, ActivityRecognitionResult activityRecognitionResult, Collection collection) {
        super(aico, j, i);
        this.a = activityRecognitionResult;
        this.b = collection;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        printWriter.print("originalNlpActivity=");
        printWriter.print(this.a);
        printWriter.print("; BluetoothDeviceParams=[");
        boolean z = true;
        for (ahmd ahmd : this.b) {
            if (!z) {
                printWriter.print(", ");
            }
            printWriter.print(ahmd);
            z = false;
        }
        printWriter.print("]");
    }
}
