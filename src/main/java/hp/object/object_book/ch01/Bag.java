package hp.object.object_book.ch01;

public class Bag {
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;

	public Bag(Long amount) {
		this.amount = amount;
	}

	public Bag(Invitation invitation, Long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}

	public boolean hasInvitation() {
		return invitation != null;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public void minusAmount(Long amount) {
		this.amount -= amount;
	}

	public void plusAmount(Long amount) {
		this.amount += amount;
	}
}
