package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.yolo.ui.AutoSaveSnackbarChimeraService;

/* renamed from: fqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fqi extends View.AccessibilityDelegate {
    final /* synthetic */ AutoSaveSnackbarChimeraService a;

    public fqi(AutoSaveSnackbarChimeraService autoSaveSnackbarChimeraService) {
        this.a = autoSaveSnackbarChimeraService;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32) {
            String string = this.a.getResources().getString(R.string.credentials_a11y_auto_save);
            accessibilityEvent.getText().clear();
            accessibilityEvent.getText().add(string);
        }
    }
}
