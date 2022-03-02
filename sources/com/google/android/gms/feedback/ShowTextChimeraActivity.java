package com.google.android.gms.feedback;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ShowTextChimeraActivity extends Activity {
    private final aoru a = jfm.a(9);

    private final void a(String str) {
        if (str != null) {
            ((TextView) findViewById(R.id.text)).setText(str);
            findViewById(R.id.empty_view).setVisibility(8);
            findViewById(R.id.text_view).setVisibility(0);
            findViewById(R.id.text_in_list_view).setVisibility(8);
            return;
        }
        findViewById(R.id.text_view).setVisibility(8);
        findViewById(R.id.empty_view).setVisibility(0);
        findViewById(R.id.text_in_list_view).setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ErrorReport errorReport;
        super.onCreate(bundle);
        if (ofy.b()) {
            errorReport = FeedbackChimeraActivity.j();
            int intExtra = getIntent().getIntExtra("feedback.FIELD_NAME", 0);
            if (errorReport == null || intExtra == 0) {
                finish();
                return;
            }
            boolean a2 = ofy.a();
            int i = R.style.DarkDialogActivityStyle;
            if (a2) {
                ofy.a((Activity) this, errorReport, (int) R.style.DialogActivityStyle, (int) R.style.DarkDialogActivityStyle, (int) R.style.DayNightDialogActivityStyle);
            } else {
                if (!ofy.a(errorReport)) {
                    i = R.style.DialogActivityStyle;
                }
                setTheme(i);
            }
            setContentView((int) R.layout.show_text_activity);
            setTitle(intExtra);
        } else {
            setContentView((int) R.layout.show_text_activity);
            int intExtra2 = getIntent().getIntExtra("feedback.FIELD_NAME", 0);
            ErrorReport j = FeedbackChimeraActivity.j();
            if (j == null || intExtra2 == 0) {
                finish();
                return;
            } else {
                setTitle(intExtra2);
                errorReport = j;
            }
        }
        String stringExtra = getIntent().getStringExtra("feedback.FIELD_VALUE");
        if (TextUtils.equals(stringExtra, "running applications")) {
            a(errorReport.q);
        } else if (TextUtils.equals(stringExtra, "system logs")) {
            a(errorReport.r);
        } else if (TextUtils.equals(stringExtra, "event logs")) {
            a(errorReport.s);
        } else if (TextUtils.equals(stringExtra, "stack trace")) {
            a(errorReport.a.crashInfo.stackTrace);
        } else if (TextUtils.equals(stringExtra, "anr info")) {
            a(errorReport.a.anrInfo.info);
        } else if (TextUtils.equals(stringExtra, "anr stack trace")) {
            a(errorReport.t);
        } else if (TextUtils.equals(stringExtra, "battery usage details")) {
            a(errorReport.a.batteryInfo.usageDetails);
        } else if (TextUtils.equals(stringExtra, "battery checkin details")) {
            a(errorReport.a.batteryInfo.checkinDetails);
        } else if (TextUtils.equals(stringExtra, "running service details")) {
            a(errorReport.a.runningServiceInfo.serviceDetails);
        } else if (TextUtils.equals(stringExtra, "product specific binary data details")) {
            new mxk(getIntent().getStringExtra("feedback.OBJECT_VALUE"), this).executeOnExecutor(this.a, new Void[0]);
        }
    }

    public final void a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            findViewById(R.id.text_view).setVisibility(8);
            findViewById(R.id.empty_view).setVisibility(0);
            findViewById(R.id.text_in_list_view).setVisibility(8);
            return;
        }
        findViewById(R.id.text_view).setVisibility(8);
        findViewById(R.id.empty_view).setVisibility(8);
        ListView listView = (ListView) findViewById(R.id.text_in_list_view);
        listView.setVisibility(0);
        listView.setAdapter(new ArrayAdapter(this, 17367043, strArr));
        listView.setDivider((Drawable) null);
        listView.setDividerHeight(0);
    }
}
