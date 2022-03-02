package defpackage;

import android.os.IInterface;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;
import com.google.android.gms.gass.internal.ProgramRequest;
import com.google.android.gms.gass.internal.ProgramResponse;

/* renamed from: npp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface npp extends IInterface {
    GassResponseParcel a(GassRequestParcel gassRequestParcel);

    ProgramResponse a(ProgramRequest programRequest);
}
