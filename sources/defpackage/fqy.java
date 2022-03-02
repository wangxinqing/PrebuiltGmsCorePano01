package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.ui.AccountChipView;
import com.google.android.gms.common.widget.phone.SnackbarLayout;

/* renamed from: fqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fqy {
    public static void a(Context context, SnackbarLayout snackbarLayout, Credential credential) {
        AccountChipView accountChipView = (AccountChipView) snackbarLayout.findViewById(R.id.account_chip_view);
        if (accountChipView != null) {
            accountChipView.a(fqg.a(credential));
        }
        TextView textView = (TextView) snackbarLayout.findViewById(R.id.credentials_auto_signin_tv_title);
        if (textView != null) {
            textView.setText(String.format(context.getResources().getString(R.string.credentials_auto_signin_tv_title), new Object[]{credential.a}).trim());
            return;
        }
        accountChipView.a(context.getResources().getString(R.string.credentials_product_name));
    }
}
