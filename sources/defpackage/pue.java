package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* renamed from: pue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pue {
    public static int a(aolx aolx) {
        aolv aolv = aolv.CONTENT_UPDATE;
        switch (aolx.ordinal()) {
            case 0:
                return R.string.no_error;
            case 1:
                return R.string.generic_error;
            case 2:
                return R.string.invalid_indexable;
            case 3:
                return R.string.sequence_table_full;
            case 4:
                return R.string.internal_error;
            case 5:
                return R.string.client_disconnected;
            case 6:
                return R.string.invalid_indexable_over_max_nesting_depth;
            case 7:
                return R.string.invalid_indexable_unsupported_data_type;
            case 8:
                return R.string.invalid_indexable_string_value_too_long;
            case 9:
                return R.string.invalid_indexable_string_key_too_long;
            case 10:
                return R.string.invalid_indexable_too_many_repeated_values;
            case 11:
                return R.string.invalid_indexable_same_as_field_repeated;
            case 12:
                return R.string.invalid_indexable_invalid_web_url;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return R.string.invalid_indexable_metadata_at_non_top_level;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return R.string.invalid_indexable_too_many_fields;
            case Service.START_CONTINUATION_MASK:
                return R.string.invalid_indexable_intent_not_handled;
            case 16:
                return R.string.invalid_indexable_missing_required_field;
            case 17:
                return R.string.invalid_indexable_invalid_repeated_field;
            case 18:
                return R.string.not_allowed;
            case 19:
                return R.string.invalid_argument_null;
            case 20:
                return R.string.invalid_argument_too_many;
            case 21:
                return R.string.invalid_argument_uri;
            case 22:
                return R.string.invalid_indexable_too_large;
            case 23:
                return R.string.invalid_argument_uri_too_long;
            case 24:
                return R.string.call_in_progress;
            case 25:
                return R.string.invalid_action_event_status;
            case 26:
                return R.string.invalid_query_text;
            case 27:
                return R.string.invalid_query_types;
            case 28:
                return R.string.invalid_query_no_index;
            case 29:
                return R.string.invalid_indexable_invalid_type_at_top_level;
            case 30:
                return R.string.no_permission;
            case 31:
                return R.string.invalid_indexable_bad_patch;
            case 32:
                return R.string.invalid_request;
            case 33:
                return R.string.feature_off;
            case 34:
                return R.string.invalid_indexable_bad_parcelable;
            case 35:
                return R.string.invalid_indexable_invalid_scope;
            case 36:
                return R.string.invalid_indexable_invalid_account;
            case 37:
                return R.string.invalid_indexable_unpaired_surrogate;
            case 38:
                return R.string.invalid_action_url_mismatch;
            case 39:
                return R.string.invalid_indexable_invalid_slice_uri;
            case 40:
            case 46:
                return R.string.null_slice;
            case 41:
                return R.string.invalid_indexable_slice_not_serializable;
            case 42:
            case 45:
                return R.string.slice_timed_out;
            case 43:
                return R.string.invalid_argument_check_sequence_table;
            case 44:
                return R.string.slice_too_large;
            case 47:
                return R.string.invalid_slice_uri_type;
            case 48:
                return R.string.invalid_slice_argument;
            case 49:
                return R.string.invalid_slice_authority;
            case 50:
                return R.string.temporary_redirect;
            default:
                return R.string.unknown_error;
        }
    }

    public static Spanned b(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }

    private static String c(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    private static String a(int i) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = String.valueOf(str).concat("&nbsp;&nbsp;&nbsp;&nbsp;");
        }
        return str;
    }

    public static String a(long j) {
        return j != 0 ? new SimpleDateFormat("dd MMM yyyy HH:mm:ss z", Locale.US).format(new Date(j)) : "Unknown";
    }

    public static String b(long j) {
        return DateUtils.getRelativeTimeSpanString(j, Calendar.getInstance().getTimeInMillis(), 1000, 0).toString();
    }

    public static String a(aolv aolv) {
        aolx aolx = aolx.NO_ERROR;
        switch (aolv.ordinal()) {
            case 0:
                return "Update";
            case 1:
                return "Remove";
            case 2:
                return "RemoveAll";
            case 3:
                return "Start";
            case 4:
                return "End";
            case 5:
                return "UpdateTags";
            case 6:
                return "Get";
            case 7:
                return "Search";
            case 8:
                return "Patch";
            case 9:
                return "Mutate (request invalid)";
            case 10:
                return "RemoveTypes";
            default:
                return "Unknown call type";
        }
    }

    public static String a(String str) {
        return str.equals("Thing") ? "Indexable" : str;
    }

    public static void a(Context context, String str, String str2, Integer num) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(String.valueOf(str2).concat(".")).setPositiveButton(R.string.common_ok, (DialogInterface.OnClickListener) null).show();
        String valueOf = String.valueOf(num);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(valueOf).length());
        sb.append(str2);
        sb.append(": statusCode=");
        sb.append(valueOf);
        sb.append(".");
        oso.a(sb.toString());
    }

    private static void b(StringBuilder sb, int i) {
        sb.append("<br>");
        sb.append(a(i));
        sb.append("}");
    }

    public static void a(View view, ActionImpl actionImpl) {
        StringBuilder sb = new StringBuilder();
        a(sb, "type", (Object) actionImpl.a, 0);
        a(sb, "objectName", (Object) actionImpl.b, 0);
        a(sb, "objectUrl", (Object) actionImpl.c, 0);
        a(sb, "objectSameAs", (Object) actionImpl.d, 0);
        a(sb, "actionStatus", (Object) actionImpl.f, 0);
        a(sb, actionImpl.g, 0);
        ActionImpl.MetadataImpl metadataImpl = actionImpl.e;
        sb.append("<br>");
        sb.append(a(0));
        sb.append("<b>metadata: </b>");
        a(sb, 0);
        a(sb, "uploadable", (Object) Boolean.valueOf(metadataImpl.b), 1);
        b(sb, 0);
        ((TextView) view.findViewById(R.id.user_action_text)).setText(b(sb.toString()));
    }

    public static void a(View view, Thing thing) {
        StringBuilder sb = new StringBuilder();
        a(sb, thing, 0);
        a(view, sb.toString());
    }

    public static void a(View view, String str) {
        ((TextView) view).setText(b(str));
    }

    public static void a(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int paddingTop = listView.getPaddingTop() + listView.getPaddingBottom();
            for (int i = 0; i < adapter.getCount(); i++) {
                View view = adapter.getView(i, (View) null, listView);
                if (view instanceof ViewGroup) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(0, 0);
                paddingTop += view.getMeasuredHeight();
            }
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = paddingTop + (listView.getDividerHeight() * (adapter.getCount() - 1));
            listView.setLayoutParams(layoutParams);
        }
    }

    public static void a(TextView textView, String str) {
        if (str == null) {
            str = "";
        }
        String htmlEncode = TextUtils.htmlEncode(str);
        StringBuilder sb = new StringBuilder(String.valueOf(htmlEncode).length() + 31);
        sb.append("<font color=blue><u>");
        sb.append(htmlEncode);
        sb.append("</u></font>");
        textView.setText(b(sb.toString()));
    }

    private static void a(StringBuilder sb, int i) {
        sb.append("<br>");
        sb.append(a(i));
        sb.append("{");
    }

    private static void a(StringBuilder sb, Bundle bundle, int i) {
        Set keySet = bundle.keySet();
        String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
        Arrays.sort(strArr);
        for (String str : strArr) {
            a(sb, str, bundle.get(str), i);
        }
    }

    private static void a(StringBuilder sb, Thing thing, int i) {
        a(sb, "url", (Object) thing.d, i);
        a(sb, "type", (Object) a(thing.e), i);
        a(sb, thing.b, i);
        Thing.Metadata metadata = thing.c;
        if (i <= 0 || !metadata.a()) {
            sb.append("<br>");
            sb.append(a(i));
            sb.append("<b>metadata: </b>");
            a(sb, i);
            int i2 = i + 1;
            a(sb, "worksOffline", (Object) Boolean.valueOf(metadata.a), i2);
            a(sb, "score", (Object) Integer.valueOf(metadata.b), i2);
            if (axrm.d()) {
                String str = metadata.c;
                if (!TextUtils.isEmpty(str)) {
                    a(sb, "accountEmail", (Object) str, i2);
                }
            }
            if (pba.a()) {
                long[] b = metadata.b("scope");
                if (b != null && b.length == 1 && (b[0] != 1 || axrm.d())) {
                    a(sb, "scope", (Object) aplx.c((int) b[0]), i2);
                } else if (b != null && b.length > 1) {
                    a(sb, "scope", (Object) Arrays.toString(b), i2);
                }
            }
            String[] a = metadata.a("sliceUri");
            if (a != null && a.length > 0) {
                a(sb, "sliceUri", (Object) a[0], i2);
            }
            b(sb, i);
        }
    }

    private static void a(StringBuilder sb, String str, Object obj, int i) {
        if (sb.length() > 0) {
            sb.append("<br>");
        }
        sb.append(a(i));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 9);
        sb2.append("<b>");
        sb2.append(str);
        sb2.append(": </b>");
        sb.append(sb2.toString());
        if (obj == null) {
            sb.append("<null>");
        } else if (obj.getClass().isArray()) {
            sb.append("[");
            int length = Array.getLength(obj);
            if (str.equals("serializedSliceBytes")) {
                StringBuilder sb3 = new StringBuilder(22);
                sb3.append(" ... ");
                sb3.append(length);
                sb3.append(" bytes");
                sb.append(sb3.toString());
            } else {
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj2 = Array.get(obj, i2);
                    String simpleName = obj2.getClass().getSimpleName();
                    if (simpleName.equals("Thing")) {
                        a(sb, i);
                        a(sb, (Thing) obj2, i + 1);
                        b(sb, i);
                    } else if (simpleName.equals("String")) {
                        sb.append(c((String) Array.get(obj, i2)));
                    } else if (!simpleName.equals("Long") || (!str.equals("dateCreated") && !str.equals("dateModified") && !str.equals("dateSent") && !str.equals("dateReceived") && !str.equals("dateRead"))) {
                        sb.append(Array.get(obj, i2));
                    } else {
                        sb.append(a(((Long) Array.get(obj, i2)).longValue()));
                    }
                    if (i2 != length - 1) {
                        sb.append(", ");
                    }
                }
            }
            sb.append("]");
        } else if (obj.getClass().getSimpleName().equals("String")) {
            sb.append(c(obj.toString()));
        } else {
            sb.append(obj.toString());
        }
    }
}
