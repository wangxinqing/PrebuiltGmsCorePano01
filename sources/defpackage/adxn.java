package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.chimera.Service;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import org.chromium.net.UrlRequest;

/* renamed from: adxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class adxn extends bhw implements IInterface {
    public adxn() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    public void a(Status status, Bundle bundle) {
    }

    public void a(Status status, GetClientTokenResponse getClientTokenResponse) {
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel.readInt();
                MaskedWallet maskedWallet = (MaskedWallet) bhx.a(parcel, MaskedWallet.CREATOR);
                Bundle bundle = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                return true;
            case 2:
                parcel.readInt();
                FullWallet fullWallet = (FullWallet) bhx.a(parcel, FullWallet.CREATOR);
                Bundle bundle2 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                return true;
            case 3:
                parcel.readInt();
                bhx.a(parcel);
                Bundle bundle3 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                return true;
            case 4:
                parcel.readInt();
                Bundle bundle4 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                return true;
            case 6:
                parcel.readInt();
                bhx.a(parcel);
                Bundle bundle5 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                return true;
            case 7:
                Status status = (Status) bhx.a(parcel, Status.CREATOR);
                GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse = (GetBuyFlowInitializationTokenResponse) bhx.a(parcel, GetBuyFlowInitializationTokenResponse.CREATOR);
                Bundle bundle6 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                return true;
            case 8:
                Status status2 = (Status) bhx.a(parcel, Status.CREATOR);
                Bundle bundle7 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                return true;
            case 9:
                Status status3 = (Status) bhx.a(parcel, Status.CREATOR);
                bhx.a(parcel);
                Bundle bundle8 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                return true;
            case 10:
                Bundle bundle9 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                a((Status) bhx.a(parcel, Status.CREATOR), (GetClientTokenResponse) bhx.a(parcel, GetClientTokenResponse.CREATOR));
                return true;
            case 11:
                a((Status) bhx.a(parcel, Status.CREATOR), (Bundle) bhx.a(parcel, Bundle.CREATOR));
                return true;
            case 12:
                Status status4 = (Status) bhx.a(parcel, Status.CREATOR);
                WebPaymentData webPaymentData = (WebPaymentData) bhx.a(parcel, WebPaymentData.CREATOR);
                Bundle bundle10 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                Status status5 = (Status) bhx.a(parcel, Status.CREATOR);
                Bundle bundle11 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                return true;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                Status status6 = (Status) bhx.a(parcel, Status.CREATOR);
                PaymentData paymentData = (PaymentData) bhx.a(parcel, PaymentData.CREATOR);
                Bundle bundle12 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                return true;
            case Service.START_CONTINUATION_MASK:
                Status status7 = (Status) bhx.a(parcel, Status.CREATOR);
                GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse = (GetSaveInstrumentDetailsResponse) bhx.a(parcel, GetSaveInstrumentDetailsResponse.CREATOR);
                Bundle bundle13 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                return true;
            case 16:
                Status status8 = (Status) bhx.a(parcel, Status.CREATOR);
                SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse = (SetUpBiometricAuthenticationKeysResponse) bhx.a(parcel, SetUpBiometricAuthenticationKeysResponse.CREATOR);
                Bundle bundle14 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                return true;
            default:
                return false;
        }
    }
}
