package com.google.android.gms.googlehelp.helpactivities;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ClickToCallChimeraActivity extends oiy implements ohv {
    public EditText a;
    private aoru b;
    private View c;
    private EditText d;
    private EditText e;
    private TextView f;
    private oak g;
    private ProgressBar h;
    private MenuItem i;

    public static Bundle a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("phone_number", str);
        bundle.putString("name", str2);
        bundle.putString("problem_description", str3);
        return bundle;
    }

    private final void b(String str, String str2, String str3) {
        a(true);
        HelpConfig helpConfig = this.x;
        okc okc = this.y;
        ohx ohx = new ohx(this);
        ohy ohy = new ohy(this, str, str2, str3);
        if (this.b == null) {
            this.b = jfm.a(9);
        }
        this.b.execute(new oba(this, helpConfig, okc, str2, str, str3, ohx, ohy));
        okg.a((nzu) this, 57, avmt.C2C);
    }

    public final ofn i() {
        throw null;
    }

    public final oar j() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0166, code lost:
        if (r0 == null) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0169, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0179, code lost:
        if (r0 != null) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            boolean r12 = defpackage.ofy.a()
            r0 = 2132019244(0x7f14082c, float:1.9676817E38)
            r1 = 2132019251(0x7f140833, float:1.9676832E38)
            if (r12 == 0) goto L_0x0018
            com.google.android.gms.googlehelp.common.HelpConfig r12 = r11.x
            r2 = 2132019245(0x7f14082d, float:1.967682E38)
            defpackage.ofy.a((com.google.android.chimera.Activity) r11, (com.google.android.gms.googlehelp.common.HelpConfig) r12, (int) r1, (int) r0, (int) r2)
            goto L_0x0028
        L_0x0018:
            com.google.android.gms.googlehelp.common.HelpConfig r12 = r11.x
            boolean r12 = defpackage.ofy.a((com.google.android.gms.googlehelp.common.HelpConfig) r12)
            if (r12 != 0) goto L_0x0024
            r0 = 2132019251(0x7f140833, float:1.9676832E38)
            goto L_0x0025
        L_0x0024:
        L_0x0025:
            r11.setTheme(r0)
        L_0x0028:
            r12 = 1
            defpackage.nzf.a(r11, r12)
            boolean r0 = defpackage.axng.b()
            boolean r0 = defpackage.ofq.a(r0)
            if (r0 != 0) goto L_0x003b
            defpackage.oay.a((com.google.android.chimera.Activity) r11)
            goto L_0x003f
        L_0x003b:
            r11.setRequestedOrientation(r12)
        L_0x003f:
            defpackage.ohj.a(r11)
            r12 = 2131952866(0x7f1304e2, float:1.9542187E38)
            java.lang.String r12 = r11.getString(r12)
            r11.setTitle((java.lang.CharSequence) r12)
            sg r0 = r11.aE()
            r0.a((java.lang.CharSequence) r12)
            axqn r12 = defpackage.axqn.a
            axqo r12 = r12.a()
            boolean r12 = r12.a()
            boolean r12 = defpackage.ofq.b(r12)
            if (r12 == 0) goto L_0x006a
            r12 = 2131624412(0x7f0e01dc, float:1.8876003E38)
            r11.setContentView((int) r12)
            goto L_0x0070
        L_0x006a:
            r12 = 2131624411(0x7f0e01db, float:1.8876E38)
            r11.setContentView((int) r12)
        L_0x0070:
            r12 = 2131428465(0x7f0b0471, float:1.8478575E38)
            android.view.View r12 = r11.findViewById(r12)
            r11.c = r12
            r12 = 2131428564(0x7f0b04d4, float:1.8478776E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.EditText r12 = (android.widget.EditText) r12
            r11.a = r12
            r12 = 2131428563(0x7f0b04d3, float:1.8478774E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.EditText r12 = (android.widget.EditText) r12
            r11.d = r12
            r12 = 2131428511(0x7f0b049f, float:1.8478669E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.EditText r12 = (android.widget.EditText) r12
            r11.e = r12
            r12 = 2131428435(0x7f0b0453, float:1.8478514E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r11.x
            android.accounts.Account r1 = r0.d
            java.lang.String r1 = r1.name
            r12.setText(r1)
            r12 = 2131428421(0x7f0b0445, float:1.8478486E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.f = r12
            avmt r1 = defpackage.avmt.C2C
            defpackage.oay.a((android.widget.TextView) r12, (defpackage.oiy) r11, (defpackage.avmt) r1)
            r12 = 2131428562(0x7f0b04d2, float:1.8478772E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.Spinner r12 = (android.widget.Spinner) r12
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getDisplayCountry()
            java.lang.String r2 = "display_country"
            java.lang.String r1 = defpackage.nzq.a((android.content.Context) r11, (com.google.android.gms.googlehelp.common.HelpConfig) r0, (java.lang.String) r2, (java.lang.String) r1)
            oak r2 = new oak
            r2.<init>(r11, r12, r1)
            r11.g = r2
            android.widget.EditText r12 = r11.a
            android.content.Context r1 = r11.getApplicationContext()
            java.lang.String r2 = "phone_number"
            java.lang.String r3 = ""
            java.lang.String r2 = defpackage.nzq.a((android.content.Context) r1, (com.google.android.gms.googlehelp.common.HelpConfig) r0, (java.lang.String) r2, (java.lang.String) r3)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x0107
            ixk r4 = defpackage.obl.a((android.content.Context) r1)
            java.lang.String r5 = "android.permission.READ_PHONE_STATE"
            int r4 = r4.a(r5)
            if (r4 != 0) goto L_0x0107
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            java.lang.String r2 = r1.getLine1Number()
            goto L_0x0108
        L_0x0107:
        L_0x0108:
            java.lang.String r1 = android.telephony.PhoneNumberUtils.stripSeparators(r2)
            boolean r1 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r1)
            if (r1 == 0) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r2 = r3
        L_0x0114:
            r12.setText(r2)
            android.widget.EditText r12 = r11.a
            android.telephony.PhoneNumberFormattingTextWatcher r1 = new android.telephony.PhoneNumberFormattingTextWatcher
            r1.<init>()
            r12.addTextChangedListener(r1)
            android.widget.EditText r12 = r11.d
            android.content.Context r1 = r11.getApplicationContext()
            java.lang.String r2 = "name"
            java.lang.String r0 = defpackage.nzq.a((android.content.Context) r1, (com.google.android.gms.googlehelp.common.HelpConfig) r0, (java.lang.String) r2, (java.lang.String) r3)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x017e
            ixk r0 = defpackage.obl.a((android.content.Context) r1)
            java.lang.String r2 = "android.permission.READ_CONTACTS"
            int r0 = r0.a(r2)
            if (r0 != 0) goto L_0x017d
            r0 = 0
            android.net.Uri r2 = android.provider.ContactsContract.Profile.CONTENT_URI     // Catch:{ Exception -> 0x0178, all -> 0x0171 }
            java.lang.String r4 = "data"
            android.net.Uri r6 = android.net.Uri.withAppendedPath(r2, r4)     // Catch:{ Exception -> 0x0178, all -> 0x0171 }
            android.content.ContentResolver r5 = r1.getContentResolver()     // Catch:{ Exception -> 0x0178, all -> 0x0171 }
            java.lang.String[] r7 = defpackage.obl.a     // Catch:{ Exception -> 0x0178, all -> 0x0171 }
            java.lang.String r8 = "mimetype = ?"
            java.lang.String[] r9 = defpackage.obl.b     // Catch:{ Exception -> 0x0178, all -> 0x0171 }
            java.lang.String r10 = "is_primary DESC"
            android.database.Cursor r0 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0178, all -> 0x0171 }
            boolean r1 = r0.moveToNext()     // Catch:{ Exception -> 0x016f, all -> 0x016d }
            if (r1 == 0) goto L_0x0165
            r1 = 0
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x016f, all -> 0x016d }
            r3 = r1
            goto L_0x0166
        L_0x0165:
        L_0x0166:
            if (r0 != 0) goto L_0x0169
            goto L_0x017f
        L_0x0169:
            r0.close()
            goto L_0x017f
        L_0x016d:
            r12 = move-exception
            goto L_0x0172
        L_0x016f:
            r1 = move-exception
            goto L_0x0179
        L_0x0171:
            r12 = move-exception
        L_0x0172:
            if (r0 == 0) goto L_0x0177
            r0.close()
        L_0x0177:
            throw r12
        L_0x0178:
            r1 = move-exception
        L_0x0179:
            if (r0 == 0) goto L_0x017c
            goto L_0x0169
        L_0x017c:
            goto L_0x017f
        L_0x017d:
            goto L_0x017f
        L_0x017e:
            r3 = r0
        L_0x017f:
            r12.setText(r3)
            r12 = 2131428513(0x7f0b04a1, float:1.8478673E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.ProgressBar r12 = (android.widget.ProgressBar) r12
            r11.h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.helpactivities.ClickToCallChimeraActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.gh_click_to_call_activity_actions, menu);
        MenuItem findItem = menu.findItem(R.id.gh_click_to_call_action_submit);
        this.i = findItem;
        findItem.setIcon(ofx.a((Context) this, ofy.b() ? ofy.a(this, R.attr.gh_primaryBlueColor) : kf.b(this, R.color.google_blue600)));
        new ocs(Arrays.asList(new EditText[]{this.d, this.a}), this.i).a();
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        NetworkInfo c2;
        if (menuItem.getItemId() != R.id.gh_click_to_call_action_submit) {
            return super.onOptionsItemSelected(menuItem);
        }
        String convertKeypadLettersToDigits = PhoneNumberUtils.convertKeypadLettersToDigits(this.a.getText().toString());
        if (TextUtils.isEmpty(convertKeypadLettersToDigits) || PhoneNumberUtils.isEmergencyNumber(convertKeypadLettersToDigits) || !PhoneNumberUtils.isGlobalPhoneNumber(PhoneNumberUtils.stripSeparators(convertKeypadLettersToDigits))) {
            a(this.a, R.string.gh_c2c_invalid_phone_number_error);
        } else {
            String obj = this.d.getText().toString();
            if (obj.length() < 2) {
                a(this.d, R.string.gh_c2c_empty_name_error);
            } else {
                String stripSeparators = PhoneNumberUtils.stripSeparators(convertKeypadLettersToDigits);
                if (stripSeparators.startsWith("+")) {
                    stripSeparators = stripSeparators.substring(1);
                }
                String trim = this.g.a().getCountry().trim();
                ou ouVar = new ou(201);
                ouVar.put("AF", "93");
                ouVar.put("AL", "355");
                ouVar.put("DZ", "213");
                ouVar.put("AD", "376");
                ouVar.put("AO", "244");
                ouVar.put("AQ", "672");
                ouVar.put("AR", "54");
                ouVar.put("AM", "374");
                ouVar.put("AW", "297");
                ouVar.put("AU", "61");
                ouVar.put("AT", "43");
                ouVar.put("AZ", "994");
                ouVar.put("BH", "973");
                ouVar.put("BD", "880");
                ouVar.put("BY", "375");
                ouVar.put("BE", "32");
                ouVar.put("BZ", "501");
                ouVar.put("BJ", "229");
                ouVar.put("BT", "975");
                ouVar.put("BO", "591");
                ouVar.put("BA", "387");
                ouVar.put("BW", "267");
                ouVar.put("BR", "55");
                ouVar.put("BN", "673");
                ouVar.put("BG", "359");
                ouVar.put("BF", "226");
                ouVar.put("MM", "95");
                ouVar.put("BI", "257");
                ouVar.put("KH", "855");
                ouVar.put("CM", "237");
                ouVar.put("CA", "1");
                ouVar.put("CV", "238");
                ouVar.put("CF", "236");
                ouVar.put("TD", "235");
                ouVar.put("CL", "56");
                ouVar.put("CN", "86");
                ouVar.put("CX", "61");
                ouVar.put("CC", "61");
                ouVar.put("CO", "57");
                ouVar.put("KM", "269");
                ouVar.put("CG", "242");
                ouVar.put("CD", "243");
                ouVar.put("CK", "682");
                ouVar.put("CR", "506");
                ouVar.put("HR", "385");
                ouVar.put("CY", "357");
                ouVar.put("CZ", "420");
                ouVar.put("DK", "45");
                ouVar.put("DJ", "253");
                ouVar.put("TL", "670");
                ouVar.put("EC", "593");
                ouVar.put("EG", "20");
                ouVar.put("SV", "503");
                ouVar.put("GQ", "240");
                ouVar.put("ER", "291");
                ouVar.put("EE", "372");
                ouVar.put("ET", "251");
                ouVar.put("FK", "500");
                ouVar.put("FO", "298");
                ouVar.put("FJ", "679");
                ouVar.put("FI", "358");
                ouVar.put("FR", "33");
                ouVar.put("PF", "689");
                ouVar.put("GA", "241");
                ouVar.put("GM", "220");
                ouVar.put("GE", "995");
                ouVar.put("DE", "49");
                ouVar.put("GH", "233");
                ouVar.put("GI", "350");
                ouVar.put("GR", "30");
                ouVar.put("GL", "299");
                ouVar.put("GT", "502");
                ouVar.put("GN", "224");
                ouVar.put("GW", "245");
                ouVar.put("GY", "592");
                ouVar.put("HT", "509");
                ouVar.put("HN", "504");
                ouVar.put("HK", "852");
                ouVar.put("HU", "36");
                ouVar.put("IN", "91");
                ouVar.put("ID", "62");
                ouVar.put("IQ", "964");
                ouVar.put("IE", "353");
                ouVar.put("IM", "44");
                ouVar.put("IL", "972");
                ouVar.put("IT", "39");
                ouVar.put("CI", "225");
                ouVar.put("JP", "81");
                ouVar.put("JO", "962");
                ouVar.put("KZ", "7");
                ouVar.put("KE", "254");
                ouVar.put("KI", "686");
                ouVar.put("KW", "965");
                ouVar.put("KG", "996");
                ouVar.put("LA", "856");
                ouVar.put("LV", "371");
                ouVar.put("LB", "961");
                ouVar.put("LS", "266");
                ouVar.put("LR", "231");
                ouVar.put("LY", "218");
                ouVar.put("LI", "423");
                ouVar.put("LT", "370");
                ouVar.put("LU", "352");
                ouVar.put("MO", "853");
                ouVar.put("MK", "389");
                ouVar.put("MG", "261");
                ouVar.put("MW", "265");
                ouVar.put("MY", "60");
                ouVar.put("MV", "960");
                ouVar.put("ML", "223");
                ouVar.put("MT", "356");
                ouVar.put("MH", "692");
                ouVar.put("MR", "222");
                ouVar.put("MU", "230");
                ouVar.put("YT", "262");
                ouVar.put("MX", "52");
                ouVar.put("FM", "691");
                ouVar.put("MD", "373");
                ouVar.put("MC", "377");
                ouVar.put("MN", "976");
                ouVar.put("ME", "382");
                ouVar.put("MA", "212");
                ouVar.put("MZ", "258");
                ouVar.put("NA", "264");
                ouVar.put("NR", "674");
                ouVar.put("NP", "977");
                ouVar.put("NL", "31");
                ouVar.put("AN", "599");
                ouVar.put("NC", "687");
                ouVar.put("NZ", "64");
                ouVar.put("NI", "505");
                ouVar.put("NE", "227");
                ouVar.put("NG", "234");
                ouVar.put("NU", "683");
                ouVar.put("NO", "47");
                ouVar.put("OM", "968");
                ouVar.put("PK", "92");
                ouVar.put("PW", "680");
                ouVar.put("PA", "507");
                ouVar.put("PG", "675");
                ouVar.put("PY", "595");
                ouVar.put("PE", "51");
                ouVar.put("PH", "63");
                ouVar.put("PN", "870");
                ouVar.put("PL", "48");
                ouVar.put("PT", "351");
                ouVar.put("PR", "1");
                ouVar.put("QA", "974");
                ouVar.put("RO", "40");
                ouVar.put("RU", "7");
                ouVar.put("RW", "250");
                ouVar.put("BL", "590");
                ouVar.put("WS", "685");
                ouVar.put("SM", "378");
                ouVar.put("ST", "239");
                ouVar.put("SA", "966");
                ouVar.put("SN", "221");
                ouVar.put("RS", "381");
                ouVar.put("SC", "248");
                ouVar.put("SL", "232");
                ouVar.put("SG", "65");
                ouVar.put("SK", "421");
                ouVar.put("SI", "386");
                ouVar.put("SB", "677");
                ouVar.put("SO", "252");
                ouVar.put("ZA", "27");
                ouVar.put("KR", "82");
                ouVar.put("ES", "34");
                ouVar.put("LK", "94");
                ouVar.put("SH", "290");
                ouVar.put("PM", "508");
                ouVar.put("SR", "597");
                ouVar.put("SZ", "268");
                ouVar.put("SE", "46");
                ouVar.put("CH", "41");
                ouVar.put("TW", "886");
                ouVar.put("TJ", "992");
                ouVar.put("TZ", "255");
                ouVar.put("TH", "66");
                ouVar.put("TG", "228");
                ouVar.put("TK", "690");
                ouVar.put("TO", "676");
                ouVar.put("TN", "216");
                ouVar.put("TR", "90");
                ouVar.put("TM", "993");
                ouVar.put("TV", "688");
                ouVar.put("AE", "971");
                ouVar.put("UG", "256");
                ouVar.put("GB", "44");
                ouVar.put("UA", "380");
                ouVar.put("UY", "598");
                ouVar.put("US", "1");
                ouVar.put("UZ", "998");
                ouVar.put("VU", "678");
                ouVar.put("VA", "39");
                ouVar.put("VE", "58");
                ouVar.put("VN", "84");
                ouVar.put("WF", "681");
                ouVar.put("YE", "967");
                ouVar.put("ZM", "260");
                ouVar.put("ZW", "263");
                String str = (String) ouVar.get(trim);
                if (str != null && !stripSeparators.startsWith(str)) {
                    String valueOf = String.valueOf(stripSeparators);
                    stripSeparators = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
                }
                String valueOf2 = String.valueOf(stripSeparators);
                String str2 = valueOf2.length() == 0 ? new String("+") : "+".concat(valueOf2);
                String displayCountry = this.g.a().getDisplayCountry();
                HelpConfig helpConfig = this.x;
                String[] strArr = obl.a;
                nzp a2 = new nzr(this, helpConfig).a();
                a2.a("name", obj);
                a2.a("display_country", displayCountry);
                a2.a("phone_number", convertKeypadLettersToDigits);
                a2.a();
                String obj2 = this.e.getText().toString();
                int i2 = jkf.a;
                TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
                if (telephonyManager == null || !telephonyManager.isNetworkRoaming() || (c2 = jkf.c(this)) == null || !c2.isRoaming()) {
                    b(str2, obj, obj2);
                } else {
                    ohu a3 = ohw.a();
                    a3.a = R.string.gh_c2c_roaming_title;
                    a3.b = R.string.gh_c2c_roaming_message;
                    a3.c = R.string.gh_c2c_action_text;
                    a3.d = 17039360;
                    a3.e = a(str2, obj, obj2);
                    a3.a().show(getSupportFragmentManager(), "roaming_handler_dialog");
                }
            }
        }
        return true;
    }

    public final void a(Bundle bundle) {
        String string = bundle.getString("phone_number");
        if (!TextUtils.isEmpty(string)) {
            b(string, bundle.getString("name"), bundle.getString("problem_description"));
        }
    }

    public final void a(EditText editText, int i2) {
        if (editText != null && editText.requestFocus()) {
            editText.setError(getString(i2));
            getWindow().setSoftInputMode(4);
            return;
        }
        Toast.makeText(this, i2, 1).show();
    }

    public final void a(boolean z) {
        if (!z) {
            this.c.setVisibility(0);
            this.f.setVisibility(0);
            this.h.setVisibility(8);
        } else {
            this.c.setVisibility(8);
            this.f.setVisibility(8);
            this.h.setVisibility(0);
        }
        this.i.setEnabled(!z);
    }
}
