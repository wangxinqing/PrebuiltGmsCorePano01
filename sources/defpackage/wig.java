package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.util.Iterator;
import java.util.List;

/* renamed from: wig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wig {
    public static int a(ShareTarget shareTarget) {
        int i;
        List b = shareTarget.b();
        int i2 = 0;
        if (!b.isEmpty()) {
            i = ((Attachment) b.get(0)).f();
            int size = b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                int i4 = i3 + 1;
                if (i != ((Attachment) b.get(i3)).f()) {
                    i = 1;
                    break;
                }
                i3 = i4;
            }
        } else {
            i = 1;
        }
        int i5 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i5 == 1) {
            List list = shareTarget.g;
            if (!list.isEmpty()) {
                int i6 = ((FileAttachment) list.get(0)).b;
                if (!anbs.d(list, new wie(i6)).a()) {
                    i2 = i6;
                }
            }
            if (i2 == 0) {
                return R.plurals.sharing_file_types_default;
            }
            if (i2 == 1) {
                return R.plurals.sharing_file_types_images;
            }
            if (i2 != 2) {
                return i2 != 3 ? R.plurals.sharing_attachment_default : R.plurals.sharing_file_types_apps;
            }
            return R.plurals.sharing_file_types_videos;
        } else if (i5 != 2) {
            return R.plurals.sharing_attachment_default;
        } else {
            List list2 = shareTarget.f;
            if (!list2.isEmpty()) {
                int i7 = ((TextAttachment) list2.get(0)).b;
                if (!anbs.d(list2, new wif(i7)).a()) {
                    i2 = i7;
                }
            }
            if (i2 == 0) {
                return R.plurals.sharing_text_types_default;
            }
            if (i2 == 1) {
                return R.plurals.sharing_text_types_links;
            }
            if (i2 == 2) {
                return R.plurals.sharing_text_types_addresses;
            }
            if (i2 != 3) {
                return R.plurals.sharing_attachment_default;
            }
            return R.plurals.sharing_text_types_phone_numbers;
        }
    }

    public static Drawable b(Context context, List list) {
        if (list.isEmpty()) {
            return null;
        }
        if (((Attachment) list.get(0)).e()) {
            return context.getDrawable(R.drawable.quantum_gm_ic_wifi_vd_theme_24);
        }
        if (!a(list)) {
            Attachment attachment = (Attachment) list.get(0);
            if (!attachment.d() || attachment.b() != 1) {
                return context.getDrawable(R.drawable.quantum_gm_ic_short_text_vd_theme_24);
            }
            return context.getDrawable(R.drawable.quantum_gm_ic_link_vd_theme_24);
        } else if (list.size() > 1) {
            return context.getDrawable(R.drawable.quantum_gm_ic_file_copy_vd_theme_24);
        } else {
            return context.getDrawable(R.drawable.quantum_gm_ic_insert_drive_file_vd_theme_24);
        }
    }

    public static CharSequence a(Context context, ShareTarget shareTarget) {
        int a = a(shareTarget);
        int size = shareTarget.b().size();
        vt vtVar = (vt) context;
        String quantityString = vtVar.a().getQuantityString(a, size);
        return vtVar.a().getString(R.string.sharing_notification_incoming_in_progress_file, new Object[]{Integer.valueOf(size), quantityString});
    }

    public static CharSequence a(Context context, ShareTarget shareTarget, CharSequence charSequence) {
        return String.format("%s. %s", new Object[]{a(context, shareTarget), ((vt) context).a().getString(R.string.sharing_notification_confirm_token, new Object[]{charSequence})});
    }

    public static CharSequence a(Context context, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return ((vt) context).a().getString(R.string.sharing_notification_outgoing_waiting_description);
        }
        return ((vt) context).a().getString(R.string.sharing_notification_confirm_token, new Object[]{charSequence});
    }

    public static String a(Context context, List list) {
        int i;
        if (list.isEmpty()) {
            return null;
        }
        if (a(list)) {
            String str = ((FileAttachment) list.get(0)).a;
            if (list.size() == 1) {
                return str;
            }
            Resources resources = context.getResources();
            Object[] objArr = new Object[3];
            objArr[0] = str;
            objArr[1] = Integer.valueOf(list.size() - 1);
            Resources resources2 = context.getResources();
            if (!whp.a(list, 1)) {
                i = !whp.a(list, 2) ? R.plurals.sharing_file_types_default : R.plurals.sharing_file_types_videos;
            } else {
                i = R.plurals.sharing_file_types_images;
            }
            objArr[2] = resources2.getQuantityString(i, list.size() - 1);
            return resources.getString(R.string.sharing_share_sheet_content_preview, objArr);
        } else if (((Attachment) list.get(0)).e()) {
            return ((WifiCredentialsAttachment) list.get(0)).a;
        } else {
            return ((TextAttachment) list.get(0)).a;
        }
    }

    public static boolean a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Attachment) it.next()).f() != 2) {
                return false;
            }
        }
        return true;
    }
}
