package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.ui.AutoSignInSnackbarChimeraService;

/* renamed from: fqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fqj extends View.AccessibilityDelegate {
    final /* synthetic */ Credential a;
    final /* synthetic */ AutoSignInSnackbarChimeraService b;

    public fqj(AutoSignInSnackbarChimeraService autoSignInSnackbarChimeraService, Credential credential) {
        this.b = autoSignInSnackbarChimeraService;
        this.a = credential;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32) {
            String format = String.format(this.b.getResources().getString(R.string.credentials_a11y_auto_signin), new Object[]{this.a.a});
            accessibilityEvent.getText().clear();
            accessibilityEvent.getText().add(format);
        }
    }
}
