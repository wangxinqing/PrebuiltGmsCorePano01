package defpackage;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;

/* renamed from: gdn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface gdn extends IInterface {
    PendingIntent a(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest);

    PendingIntent a(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest);

    PendingIntent a(FinishSessionWorkflowRequest finishSessionWorkflowRequest);

    PendingIntent a(SetupAccountWorkflowRequest setupAccountWorkflowRequest);

    PendingIntent a(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest);

    PendingIntent a(TokenWorkflowRequest tokenWorkflowRequest);

    PendingIntent a(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest);

    PendingIntent b(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest);
}
