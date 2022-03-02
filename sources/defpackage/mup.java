package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.feedback.PreviewChimeraActivity;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: mup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mup extends BaseAdapter {
    public final List a = new ArrayList();
    public final PreviewChimeraActivity b;

    public mup(PreviewChimeraActivity previewChimeraActivity, ErrorReport errorReport) {
        this.b = previewChimeraActivity;
        String str = errorReport.B;
        if (str != null && !TextUtils.isEmpty(str)) {
            a((int) R.string.gf_user_account, (Object) errorReport.B);
        }
        a(R.string.gf_error_report_type, Integer.valueOf(errorReport.a.type), 2);
        if (!TextUtils.isEmpty(errorReport.b)) {
            a((int) R.string.gf_error_report_description, (Object) errorReport.b);
        }
        a((int) R.string.gf_error_report_package_name, (Object) errorReport.a.packageName);
        a((int) R.string.gf_error_report_package_version, (Object) Integer.valueOf(errorReport.c));
        a((int) R.string.gf_error_report_package_version_name, (Object) errorReport.d);
        a((int) R.string.gf_error_report_installer_package_name, (Object) errorReport.a.installerPackageName);
        a((int) R.string.gf_error_report_process_name, (Object) errorReport.a.processName);
        a(R.string.gf_error_report_time, Long.valueOf(errorReport.a.time), 1);
        a((int) R.string.gf_error_report_system_app, (Object) Boolean.valueOf(errorReport.a.systemApp));
        a((int) R.string.gf_locale, (Object) errorReport.C);
        a((int) R.string.gf_error_report_system);
        a((int) R.string.gf_error_report_device, (Object) errorReport.e);
        a((int) R.string.gf_error_report_build_id, (Object) errorReport.f);
        a((int) R.string.gf_error_report_build_type, (Object) errorReport.g);
        a((int) R.string.gf_error_report_build_fingerprint, (Object) errorReport.j);
        a((int) R.string.gf_error_report_model, (Object) errorReport.h);
        a((int) R.string.gf_error_report_product, (Object) errorReport.i);
        a((int) R.string.gf_error_report_sdk_version, (Object) Integer.valueOf(errorReport.k));
        a((int) R.string.gf_error_report_release, (Object) errorReport.l);
        a((int) R.string.gf_error_report_incremental, (Object) errorReport.m);
        a((int) R.string.gf_error_report_codename, (Object) errorReport.n);
        a((int) R.string.gf_error_report_board, (Object) errorReport.o);
        a((int) R.string.gf_error_report_brand, (Object) errorReport.p);
        String str2 = errorReport.B;
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            a((int) R.string.gf_user_account, (Object) errorReport.B);
        }
        String[] strArr = errorReport.q;
        if (!(strArr == null || strArr.length == 0)) {
            a(R.string.gf_error_report_running_apps, strArr, 0, "com.google.android.gms.feedback.ShowTextActivity", "running applications");
        }
        String[] strArr2 = errorReport.r;
        if (strArr2 != null) {
            a(R.string.gf_system_log, strArr2, 0, "com.google.android.gms.feedback.ShowTextActivity", "system logs");
        }
        String[] strArr3 = errorReport.s;
        if (strArr3 != null) {
            a(R.string.gf_event_log, strArr3, 0, "com.google.android.gms.feedback.ShowTextActivity", "event logs");
        }
        if (errorReport.a.crashInfo != null) {
            a((int) R.string.gf_error_report_crash);
            a((int) R.string.gf_error_report_exception_class_name, (Object) errorReport.a.crashInfo.exceptionClassName);
            a((int) R.string.gf_error_report_exception_throw_file_name, (Object) errorReport.a.crashInfo.throwFileName);
            a((int) R.string.gf_error_report_exception_throw_class_name, (Object) errorReport.a.crashInfo.throwClassName);
            a((int) R.string.gf_error_report_exception_throw_method_name, (Object) errorReport.a.crashInfo.throwMethodName);
            a((int) R.string.gf_error_report_exception_throw_line_number, (Object) Integer.valueOf(errorReport.a.crashInfo.throwLineNumber));
            a(R.string.gf_error_report_exception_stack_trace, errorReport.a.crashInfo.stackTrace, 0, "com.google.android.gms.feedback.ShowTextActivity", "stack trace");
        }
        if (errorReport.a.anrInfo != null) {
            a((int) R.string.gf_error_report_anr);
            if (errorReport.a.anrInfo.activity != null) {
                a((int) R.string.gf_error_report_anr_activity, (Object) errorReport.a.anrInfo.activity);
            }
            a((int) R.string.gf_error_report_anr_cause, (Object) errorReport.a.anrInfo.cause);
            a(R.string.gf_error_report_anr_info, errorReport.a.anrInfo.info, 0, "com.google.android.gms.feedback.ShowTextActivity", "anr info");
            String str3 = errorReport.t;
            if (str3 != null) {
                a(R.string.gf_error_report_anr_stack_traces, str3, 0, "com.google.android.gms.feedback.ShowTextActivity", "anr stack trace");
            }
        }
        if (errorReport.a.batteryInfo != null) {
            a((int) R.string.common_battery);
            a((int) R.string.gf_error_report_battery_usage_percent, (Object) Integer.valueOf(errorReport.a.batteryInfo.usagePercent));
            a(R.string.gf_error_report_duration, Long.valueOf(errorReport.a.batteryInfo.durationMicros), 3);
            String str4 = "com.google.android.gms.feedback.ShowTextActivity";
            a(R.string.gf_error_report_battery_usage_details, errorReport.a.batteryInfo.usageDetails, 0, str4, "battery usage details");
            a(R.string.gf_error_report_battery_checkin_details, errorReport.a.batteryInfo.checkinDetails, 0, str4, "battery checkin details");
        }
        if (errorReport.a.runningServiceInfo != null) {
            a((int) R.string.gf_error_report_running_service);
            a(R.string.gf_error_report_duration, Long.valueOf(errorReport.a.runningServiceInfo.durationMillis), 4);
            a(R.string.gf_error_report_running_service_details, errorReport.a.runningServiceInfo.serviceDetails, 0, "com.google.android.gms.feedback.ShowTextActivity", "running service details");
        }
        a((int) R.string.gf_network_data);
        if (!TextUtils.isEmpty(errorReport.A)) {
            a((int) R.string.gf_network_name, (Object) errorReport.A);
        }
        a(R.string.gf_phone_type, Integer.valueOf(errorReport.y), 5);
        a(R.string.gf_network_type, Integer.valueOf(errorReport.z), 6);
        a((int) R.string.gf_network_mcc, (Object) Integer.valueOf(errorReport.F));
        a((int) R.string.gf_network_mnc, (Object) Integer.valueOf(errorReport.G));
        mwg mwg = FeedbackChimeraActivity.d;
        if (mwg == null || !mwg.f()) {
            a(errorReport);
        } else if (FeedbackChimeraActivity.d.d()) {
            a(errorReport);
        } else {
            a((int) R.string.common_loading, (Object) null);
            a();
        }
    }

    private final String a(double d) {
        int i;
        int i2;
        int i3;
        StringBuilder sb = new StringBuilder();
        int floor = (int) Math.floor(d / 1000.0d);
        if (floor > 86400) {
            i = floor / 86400;
            floor -= 86400 * i;
        } else {
            i = 0;
        }
        if (floor > 3600) {
            i2 = floor / 3600;
            floor -= i2 * 3600;
        } else {
            i2 = 0;
        }
        if (floor > 60) {
            i3 = floor / 60;
            floor -= i3 * 60;
        } else {
            i3 = 0;
        }
        if (i > 0) {
            sb.append(this.b.getString(R.string.gf_battery_history_days, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(floor)}));
        } else if (i2 > 0) {
            sb.append(this.b.getString(R.string.gf_battery_history_hours, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(floor)}));
        } else if (i3 > 0) {
            sb.append(this.b.getString(R.string.gf_battery_history_minutes, new Object[]{Integer.valueOf(i3), Integer.valueOf(floor)}));
        } else {
            sb.append(this.b.getString(R.string.gf_battery_history_seconds, new Object[]{Integer.valueOf(floor)}));
        }
        return sb.toString();
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final int getCount() {
        return this.a.size();
    }

    public final Object getItem(int i) {
        return this.a.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        muo muo = (muo) this.a.get(i);
        LayoutInflater layoutInflater = (LayoutInflater) this.b.getSystemService("layout_inflater");
        if (muo.e != null || muo.a()) {
            if (!muo.b()) {
                if (view == null || view.getId() != R.id.label_value_row) {
                    view = layoutInflater.inflate(R.layout.label_value_row, viewGroup, false);
                }
            } else if (view == null || view.getId() != R.id.expandable_row) {
                view = layoutInflater.inflate(R.layout.expandable_row, viewGroup, false);
                if (ofy.b()) {
                    TextView textView2 = (TextView) view.findViewById(R.id.label);
                    int i2 = Build.VERSION.SDK_INT;
                    Drawable drawable = textView2.getCompoundDrawablesRelative()[2];
                    if (drawable != null) {
                        PreviewChimeraActivity previewChimeraActivity = this.b;
                        Drawable b2 = ofx.b(drawable, (Context) previewChimeraActivity, ofy.a(previewChimeraActivity, R.attr.ghf_greyIconColor));
                        int i3 = Build.VERSION.SDK_INT;
                        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, b2, (Drawable) null);
                    }
                }
            }
            TextView textView3 = (TextView) view.findViewById(R.id.label);
            if (muo.a()) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                if (TextUtils.isEmpty(muo.d)) {
                    textView3.setText(muo.a.intValue());
                } else {
                    textView3.setText(muo.d);
                }
            }
            if (muo.b == null && (textView = (TextView) view.findViewById(R.id.value)) != null) {
                if (muo.a()) {
                    textView.setGravity(17);
                    textView.setText(this.b.getString(R.string.common_loading));
                } else {
                    textView.setGravity(8388611);
                    int i4 = muo.c;
                    if (i4 == 0) {
                        textView.setText(String.valueOf(muo.e));
                    } else if (i4 == 1) {
                        textView.setText(DateFormat.getDateInstance(0).format(new Date(((Long) muo.e).longValue())));
                    } else if (i4 == 2) {
                        int intValue = ((Integer) muo.e).intValue();
                        if (intValue == 1) {
                            textView.setText(R.string.gf_error_report_crash);
                        } else if (intValue == 2) {
                            textView.setText(R.string.gf_error_report_anr);
                        } else if (intValue == 3) {
                            textView.setText(R.string.common_battery);
                        } else if (intValue == 5) {
                            textView.setText(R.string.gf_error_report_running_service);
                        } else if (intValue == 11) {
                            textView.setText(R.string.gf_error_report_user_initiated);
                        }
                    } else if (i4 == 3) {
                        textView.setText(a((double) (((Long) muo.e).longValue() / 1000)));
                    } else if (i4 == 4) {
                        textView.setText(a((double) ((Long) muo.e).longValue()));
                    } else if (i4 != 5) {
                        textView.setText(a(((Integer) muo.e).intValue(), "NETWORK_TYPE_"));
                    } else {
                        textView.setText(a(((Integer) muo.e).intValue(), "PHONE_TYPE_"));
                    }
                }
            }
            return view;
        }
        if (view == null || view.getId() != R.id.section_header_row) {
            view = layoutInflater.inflate(R.layout.section_header_row, viewGroup, false);
        }
        ((TextView) view).setText(muo.a.intValue());
        return view;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean isEnabled(int i) {
        return ((muo) this.a.get(i)).b();
    }

    private static final String a(int i, String str) {
        Field[] declaredFields = TelephonyManager.class.getDeclaredFields();
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            Field field = declaredFields[i2];
            try {
                if (field.getName().startsWith(str)) {
                    String valueOf = String.valueOf(field.get((Object) null));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length());
                    sb.append(valueOf);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder(11);
                    sb3.append(i);
                    if (sb2.equals(sb3.toString())) {
                        return field.getName().substring(str.length());
                    }
                }
                i2++;
            } catch (IllegalArgumentException e) {
                StringBuilder sb4 = new StringBuilder(11);
                sb4.append(i);
                return sb4.toString();
            } catch (IllegalAccessException e2) {
                StringBuilder sb5 = new StringBuilder(11);
                sb5.append(i);
                return sb5.toString();
            }
        }
        return null;
    }

    private final void a(int i) {
        a(i, (Object) null);
    }

    private final void a(int i, Object obj) {
        a(i, obj, 0);
    }

    private final void a(int i, Object obj, int i2) {
        a(i, obj, i2, (String) null, (String) null);
    }

    private final void a(int i, Object obj, int i2, String str, String str2) {
        this.a.add(new muo((String) null, Integer.valueOf(i), obj, str, i2, str2));
    }

    private final void a(String str, String str2) {
        this.a.add(new muo(str, (Integer) null, str2, (String) null, 0, (String) null));
    }

    public final void a() {
        new qvr(Looper.getMainLooper()).postDelayed(new mun(this), axgy.e());
    }

    public final void a(ErrorReport errorReport) {
        boolean z;
        Bundle bundle = errorReport.D;
        int i = 0;
        if (bundle == null || bundle.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            a((int) R.string.gf_product_specific_data);
            if (ofq.b(axqb.e())) {
                ArrayList arrayList = new ArrayList(errorReport.D.keySet());
                Collections.sort(arrayList);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str = (String) arrayList.get(i2);
                    a(str, errorReport.D.getString(str));
                }
            } else {
                for (String str2 : errorReport.D.keySet()) {
                    a(str2, errorReport.D.getString(str2));
                }
            }
        }
        String[] strArr = errorReport.V;
        if (strArr != null && strArr.length > 0) {
            if (!z) {
                a((int) R.string.gf_product_specific_data);
            }
            while (true) {
                String[] strArr2 = errorReport.V;
                if (i < strArr2.length) {
                    String str3 = strArr2[i];
                    this.a.add(new muo(str3, Integer.valueOf(R.string.gf_product_specific_data), str3, "com.google.android.gms.feedback.ShowTextActivity", 0, "product specific binary data details"));
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
