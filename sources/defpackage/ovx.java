package defpackage;

/* renamed from: ovx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ovx {
    private static final anaf a;

    static {
        anab h = anaf.h();
        h.a("Action", aonm.ACTION);
        h.a("AggregateRating", aonm.AGGREGATE_RATING);
        h.a("AlarmInstance", aonm.ALARM_INSTANCE);
        h.a("Alarm", aonm.ALARM);
        h.a("Attendee", aonm.ATTENDEE);
        h.a("Audiobook", aonm.AUDIOBOOK);
        h.a("Book", aonm.BOOK);
        h.a("ContactPoint", aonm.CONTACT_POINT);
        h.a("Contact", aonm.CONTACT);
        h.a("ContextualEvent", aonm.CONTEXTUAL_EVENT);
        h.a("Conversation", aonm.CONVERSATION);
        h.a("Date", aonm.DATE);
        h.a("DateTime", aonm.DATE_TIME);
        h.a("DigitalDocumentPermission", aonm.DIGITAL_DOCUMENT_PERMISSION);
        h.a("DigitalDocument", aonm.DIGITAL_DOCUMENT);
        h.a("EmailMessage", aonm.EMAIL_MESSAGE);
        h.a("Event", aonm.EVENT);
        h.a("ExtractedEntity", aonm.EXTRACTED_ENTITY);
        h.a("Flight", aonm.FLIGHT);
        h.a("GeoShape", aonm.GEO_SHAPE);
        h.a("GmmVoiceModel", aonm.GMM_VOICE_MODEL);
        h.a("LocalBusiness", aonm.LOCAL_BUSINESS);
        h.a("Message", aonm.MESSAGE);
        h.a("MobileApplication", aonm.MOBILE_APPLICATION);
        h.a("Movie", aonm.MOVIE);
        h.a("MusicAlbum", aonm.MUSIC_ALBUM);
        h.a("MusicGroup", aonm.MUSIC_GROUP);
        h.a("MusicPlaylist", aonm.MUSIC_PLAYLIST);
        h.a("MusicRecording", aonm.MUSIC_RECORDING);
        h.a("NoteDigitalDocument", aonm.NOTE_DIGITAL_DOCUMENT);
        h.a("Person", aonm.PERSON);
        h.a("Photograph", aonm.PHOTOGRAPH);
        h.a("Place", aonm.PLACE);
        h.a("PostalAddress", aonm.POSTAL_ADDRESS);
        h.a("PresentationDigitalDocument", aonm.PRESENTATION_DIGITAL_DOCUMENT);
        h.a("Reservation", aonm.RESERVATION);
        h.a("Restaurant", aonm.RESTAURANT);
        h.a("SpreadsheetDigitalDocument", aonm.SPREADSHEET_DIGITAL_DOCUMENT);
        h.a("StashRecord", aonm.STASH_RECORD);
        h.a("StickerPack", aonm.STICKER_PACK);
        h.a("Sticker", aonm.STICKER);
        h.a("StopwatchLap", aonm.STOPWATCH_LAP);
        h.a("Stopwatch", aonm.STOPWATCH);
        h.a("TextDigitalDocument", aonm.TEXT_DIGITAL_DOCUMENT);
        h.a("Thing", aonm.THING);
        h.a("Timer", aonm.TIMER);
        h.a("TVSeries", aonm.TV_SERIES);
        h.a("VideoObject", aonm.VIDEO_OBJECT);
        h.a("WebPage", aonm.WEB_PAGE);
        a = h.a();
    }

    public static aonm a(String str, oyb oyb) {
        if (str == null) {
            return aonm.UNKNOWN;
        }
        aonm aonm = (aonm) a.get(str);
        if (aonm == null) {
            return (oyb.a(str) || oyb.b.contains(str)) ? aonm.CONFIG_OVERRIDE : aonm.UNKNOWN;
        }
        return aonm;
    }
}
