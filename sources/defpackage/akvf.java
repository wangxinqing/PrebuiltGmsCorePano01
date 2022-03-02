package defpackage;

import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.places.Subscription;
import java.util.concurrent.Future;

/* renamed from: akvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface akvf {
    Future a(CheckInReport checkInReport, PlacesParams placesParams);

    Future a(Subscription subscription);

    Future a(String str);

    Future b(Subscription subscription);
}
