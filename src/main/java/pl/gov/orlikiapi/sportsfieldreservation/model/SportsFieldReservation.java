package pl.gov.orlikiapi.sportsfieldreservation.model;

import pl.gov.orlikiapi.sportsfield.model.SportsField;
import pl.gov.orlikiapi.user.model.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sports_field_reservation")
public class SportsFieldReservation {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn (name = "user_id")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn (name = "sports_field_id")
    private SportsField sportsField;

    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "end_date", nullable = false)
    private Date endDate;

    public SportsFieldReservation() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SportsField getSportsField() {
        return sportsField;
    }

    public void setSportsField(SportsField sportsField) {
        this.sportsField = sportsField;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "SportsField Reservation [id=" + id + ", start=" + startDate + ", end=" + endDate + "]";
    }
}
