package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;

/* renamed from: gdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gdl extends bhv implements gdn {
    public gdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
    }

    public final PendingIntent a(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) accountRemovalAllowedWorkflowRequest);
        Parcel a = a(8, aQ);
        PendingIntent pendingIntent = (PendingIntent) bhx.a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    public final PendingIntent b(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) updateCredentialsWorkflowRequest);
        Parcel a = a(3, aQ);
        PendingIntent pendingIntent = (PendingIntent) bhx.a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    public final PendingIntent a(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) confirmCredentialsWorkflowRequest);
        Parcel a = a(4, aQ);
        PendingIntent pendingIntent = (PendingIntent) bhx.a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    public final PendingIntent a(FinishSessionWorkflowRequest finishSessionWorkflowRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) finishSessionWorkflowRequest);
        Parcel a = a(7, aQ);
        PendingIntent pendingIntent = (PendingIntent) bhx.a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    public final PendingIntent a(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) setupAccountWorkflowRequest);
        Parcel a = a(1, aQ);
        PendingIntent pendingIntent = (PendingIntent) bhx.a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    public final PendingIntent a(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) startAddAccountSessionWorkflowRequest);
        Parcel a = a(5, aQ);
        PendingIntent pendingIntent = (PendingIntent) bhx.a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    public final PendingIntent a(TokenWorkflowRequest tokenWorkflowRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) tokenWorkflowRequest);
        Parcel a = a(2, aQ);
        PendingIntent pendingIntent = (PendingIntent) bhx.a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }

    public final PendingIntent a(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) updateCredentialsWorkflowRequest);
        Parcel a = a(6, aQ);
        PendingIntent pendingIntent = (PendingIntent) bhx.a(a, PendingIntent.CREATOR);
        a.recycle();
        return pendingIntent;
    }
}
