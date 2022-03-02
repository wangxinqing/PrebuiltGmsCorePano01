package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Response;
import com.google.android.gms.search.ime.GetIMEUpdatesCall$Response;

@Deprecated
/* renamed from: aaki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaki extends aakl implements jbh {
    public final void a(aakj aakj) {
        GetCorpusHandlesRegisteredForIMECall$Response getCorpusHandlesRegisteredForIMECall$Response = new GetCorpusHandlesRegisteredForIMECall$Response();
        getCorpusHandlesRegisteredForIMECall$Response.a = new Status(8, "API Disabled");
        Parcel aQ = aakj.aQ();
        bhx.a(aQ, (Parcelable) getCorpusHandlesRegisteredForIMECall$Response);
        aakj.c(2, aQ);
    }

    public final void b(aakj aakj) {
        GetIMEUpdatesCall$Response getIMEUpdatesCall$Response = new GetIMEUpdatesCall$Response();
        getIMEUpdatesCall$Response.a = new Status(8, "API Disabled");
        Parcel aQ = aakj.aQ();
        bhx.a(aQ, (Parcelable) getIMEUpdatesCall$Response);
        aakj.c(3, aQ);
    }
}
