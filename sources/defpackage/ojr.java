package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;

/* renamed from: ojr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ojr extends bhv implements ojt {
    public ojr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
    }

    public final void a(Bundle bundle, long j, GoogleHelp googleHelp, ojq ojq) {
        throw null;
    }

    public final void a(GoogleHelp googleHelp, String str, String str2, ojq ojq) {
        throw null;
    }

    public final void a(GoogleHelp googleHelp, ojq ojq) {
        throw null;
    }

    public final void a(InProductHelp inProductHelp, ojq ojq) {
        throw null;
    }

    public final void a(SupportRequestHelp supportRequestHelp, ojq ojq) {
        throw null;
    }

    public final void b(Bundle bundle, long j, GoogleHelp googleHelp, ojq ojq) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bundle);
        aQ.writeLong(j);
        bhx.a(aQ, (Parcelable) googleHelp);
        bhx.a(aQ, (IInterface) ojq);
        c(9, aQ);
    }

    public final void b(GoogleHelp googleHelp, String str, String str2, ojq ojq) {
        throw null;
    }

    public final void b(GoogleHelp googleHelp, ojq ojq) {
        throw null;
    }

    public final void b(SupportRequestHelp supportRequestHelp, ojq ojq) {
        throw null;
    }

    public final void c(GoogleHelp googleHelp, ojq ojq) {
        throw null;
    }

    public final void d(GoogleHelp googleHelp, ojq ojq) {
        throw null;
    }

    public final void e(GoogleHelp googleHelp, ojq ojq) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) googleHelp);
        bhx.a(aQ, (Parcelable) null);
        bhx.a(aQ, (IInterface) ojq);
        b(2, aQ);
    }

    public final void a(FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp, ojq ojq) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) feedbackOptions);
        bhx.a(aQ, (Parcelable) bundle);
        aQ.writeLong(j);
        bhx.a(aQ, (Parcelable) googleHelp);
        bhx.a(aQ, (IInterface) ojq);
        c(10, aQ);
    }
}
