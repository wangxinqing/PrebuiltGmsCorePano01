package defpackage;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: gdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gdo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SetupAccountWorkflowRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        Bundle bundle = new Bundle();
        String str = "null";
        String str2 = str;
        ArrayList arrayList = null;
        AppDescription appDescription = null;
        String str3 = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        String str4 = null;
        String str5 = null;
        ManagedAuthOptions managedAuthOptions = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 3:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 4:
                    arrayList = ivw.C(parcel2, readInt);
                    break;
                case 5:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 6:
                    appDescription = (AppDescription) ivw.a(parcel2, readInt, AppDescription.CREATOR);
                    break;
                case 7:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) ivw.a(parcel2, readInt, AccountAuthenticatorResponse.CREATOR);
                    break;
                case 10:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    str = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 16:
                    z6 = ivw.c(parcel2, readInt);
                    break;
                case 17:
                    z7 = ivw.c(parcel2, readInt);
                    break;
                case 18:
                    z8 = ivw.c(parcel2, readInt);
                    break;
                case 19:
                    z9 = ivw.c(parcel2, readInt);
                    break;
                case 20:
                    managedAuthOptions = (ManagedAuthOptions) ivw.a(parcel2, readInt, ManagedAuthOptions.CREATOR);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new SetupAccountWorkflowRequest(i, z, z2, arrayList, bundle, appDescription, z3, str3, accountAuthenticatorResponse, z4, z5, str, str2, str4, str5, z6, z7, z8, z9, managedAuthOptions);
    }
}
