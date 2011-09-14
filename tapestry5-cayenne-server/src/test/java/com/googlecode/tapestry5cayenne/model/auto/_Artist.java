package com.googlecode.tapestry5cayenne.model.auto;

import java.util.List;
import java.util.Map;

import org.apache.cayenne.CayenneDataObject;

import com.googlecode.tapestry5cayenne.model.AcceptedBid;
import com.googlecode.tapestry5cayenne.model.ArtistDetails;
import com.googlecode.tapestry5cayenne.model.Bid;
import com.googlecode.tapestry5cayenne.model.Painting;

/**
 * Class _Artist was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Artist extends CayenneDataObject {

    private static final long serialVersionUID = -9136187678862455236L;
    public static final String NAME_PROPERTY = "name";
    public static final String ACCEPTED_BIDS_PROPERTY = "acceptedBids";
    public static final String CURRENT_BID_PROPERTY = "currentBid";
    public static final String DETAILS_PROPERTY = "details";
    public static final String PAINTING_LIST_PROPERTY = "paintingList";
    public static final String PAINTINGS_BY_TITLE_PROPERTY = "paintingsByTitle";

    public static final String ID_PK_COLUMN = "id";

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToAcceptedBids(AcceptedBid obj) {
        addToManyTarget("acceptedBids", obj, true);
    }
    public void removeFromAcceptedBids(AcceptedBid obj) {
        removeToManyTarget("acceptedBids", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<AcceptedBid> getAcceptedBids() {
        return (List<AcceptedBid>)readProperty("acceptedBids");
    }


    public void setCurrentBid(Bid currentBid) {
        setToOneTarget("currentBid", currentBid, true);
    }

    public Bid getCurrentBid() {
        return (Bid)readProperty("currentBid");
    }


    public void setDetails(ArtistDetails details) {
        setToOneTarget("details", details, true);
    }

    public ArtistDetails getDetails() {
        return (ArtistDetails)readProperty("details");
    }


    public void addToPaintingList(Painting obj) {
        addToManyTarget("paintingList", obj, true);
    }
    public void removeFromPaintingList(Painting obj) {
        removeToManyTarget("paintingList", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Painting> getPaintingList() {
        return (List<Painting>)readProperty("paintingList");
    }


    public void addToPaintingsByTitle(Painting obj) {
        addToManyTarget("paintingsByTitle", obj, true);
    }
    public void removeFromPaintingsByTitle(Painting obj) {
        removeToManyTarget("paintingsByTitle", obj, true);
    }
    @SuppressWarnings("unchecked")
    public Map<String, Painting> getPaintingsByTitle() {
        return (Map<String, Painting>)readProperty("paintingsByTitle");
    }


}
