package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: myh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class myh extends bhv implements myj {
    public myh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackAsyncService");
    }

    public final String a(FeedbackOptions feedbackOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) feedbackOptions);
        Parcel a = a(1, aQ);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final Bitmap b(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(3, aQ);
        Bitmap bitmap = (Bitmap) bhx.a(a, Bitmap.CREATOR);
        a.recycle();
        return bitmap;
    }

    public final boolean a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(2, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }
}
