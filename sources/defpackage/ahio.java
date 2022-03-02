package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.io.PrintWriter;

/* renamed from: ahio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahio extends aicl {
    final /* synthetic */ ActivityRecognitionResult a;
    final /* synthetic */ boolean b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahio(aico aico, long j, int i, int i2, int i3, ActivityRecognitionResult activityRecognitionResult, boolean z) {
        super(aico, j, (String) null, (Object) null, i, i2, i3);
        this.a = activityRecognitionResult;
        this.b = z;
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        printWriter.print(this.a);
        printWriter.print(" sentToClient=");
        printWriter.print(this.b);
    }
}
