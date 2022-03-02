package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.model.PageData;

/* renamed from: mfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mfu {
    public static Dialog a(Activity activity) {
        sr a = a((Context) activity);
        a.b((int) R.string.common_something_went_wrong);
        a.b((int) R.string.common_ok, mfs.a);
        return a.b();
    }

    public static Dialog b(Activity activity, DialogInterface.OnClickListener onClickListener) {
        String string = activity.getString(R.string.common_app_name);
        sr a = a((Context) activity);
        a.a((int) R.string.fm_upgrade_required_title);
        a.a((CharSequence) activity.getString(R.string.fm_upgrade_required_message, new Object[]{string}));
        a.b((int) R.string.common_got_it, onClickListener);
        return a.b();
    }

    public static Dialog a(Activity activity, DialogInterface.OnClickListener onClickListener) {
        sr a = a((Context) activity);
        a.b((int) R.string.common_something_went_wrong);
        a.b((int) R.string.common_cancel, onClickListener);
        return a.b();
    }

    public static Dialog a(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        sr a = a((Context) activity);
        a.b((int) R.string.common_something_went_wrong);
        a.b((int) R.string.common_try_again, onClickListener);
        a.a((int) R.string.common_cancel, onClickListener2);
        return a.b();
    }

    public static Dialog a(Activity activity, PageData pageData, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, boolean z) {
        sr a = a((Context) activity);
        if (pageData.a.containsKey(2)) {
            a.b((CharSequence) pageData.a.get(2));
        }
        if (pageData.a.containsKey(3)) {
            a.a((CharSequence) Html.fromHtml(jlh.a((String) pageData.a.get(3)), (Html.ImageGetter) null, new mgb(pageData, (mfz) activity, str)));
        }
        if (pageData.a.containsKey(4) && onClickListener != null) {
            a.b((CharSequence) pageData.a.get(4), onClickListener);
        }
        if (pageData.a.containsKey(5) && onClickListener2 != null) {
            a.a((CharSequence) pageData.a.get(5), onClickListener2);
        }
        a.a(z);
        return a.b();
    }

    public static sr a(Context context) {
        return new mft(context);
    }
}
