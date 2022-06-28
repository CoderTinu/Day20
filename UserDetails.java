package Day20;

import org.junit.Test;

import junit.framework.Assert;

public class UserDetails {
	@Test
    public void GivenFirstName_WhenProper_ShouldReturnTrue() {
        UserDetails validator = new UserDetails();
        boolean result = validator.validateFirstName("Tinu");
        Assert.assertTrue(result);
    }
    
	private boolean validateFirstName(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test
    public void GivenFirstName_WhenShort_ShouldReturnFalse() {
        UserDetails validator = new UserDetails();
        boolean result = validator.validateFirstName("Tinu");
        Assert.assertTrue(result);
    }
    @Test
    public void GivenFirstName_WhenSpecialChar_ShouldReturnFalse() {
        UserDetails validator = new UserDetails();
        boolean result = validator.validateFirstName("Tin@u");
        Assert.assertTrue(result);
    }
    @Test
    public void GivenLastName_WhenProper_ShouldReturnTrue() {
        UserDetails validator = new UserDetails();
        boolean result = validator.validateLastName("Nagrale");
        Assert.assertTrue(result);
    }
    private boolean validateLastName(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test
    public void GivenLastName_WhenShort_ShouldReturnFalse() {
        UserDetails validator = new UserDetails();
        boolean result = validator.validateLastName("Na");
        Assert.assertTrue(result);
    }
    @Test
    public void GivenLastName_WhenSpecialChar_ShouldReturnFalse() {
        UserDetails validator = new UserDetails();
        boolean result = validator.validateLastName("Na@ga@le");
        Assert.assertTrue(result);
    }
    @Test
    public void GivenPassWord_WhenProper_ShouldReturnTrue() {
        UserDetails validator = new UserDetails();
        boolean result = validator.validatePassWord("Tinu_123");
        Assert.assertTrue(result);
    }
    private boolean validatePassWord(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test
    public void GivenPassWord_WhenNotProper_ShouldReturnFalse() {
        UserDetails validator = new UserDetails();
        boolean result = validator.validatePassWord("Tinu123");
        Assert.assertTrue(result);
    }
    @Test
    public void GivenEmail_WhenProper_ShouldReturnTrue() {
        UserDetails validator = new UserDetails();
        boolean result = validator.validateEmail("tinu123@gmail.com");
        Assert.assertTrue(result);
    }
    private boolean validateEmail(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test
    public void GivenEmail_WhenNotProper_ShouldReturnFalse() {
        UserDetails validator = new UserDetails();
        boolean result = validator.validateEmail("tinu12@.com");
        Assert.assertTrue(result);
    }
    @Test
    public void GivenPhoneNum_WhenProper_ShouldReturnTrue() {
        UserDetails validator = new UserDetails();
        boolean result = validator.validatePhoneNum("91 8765545467");
        Assert.assertTrue(result);
    }
    private boolean validatePhoneNum(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test
    public void GivenPhoneNum_WhenNotProper_ShouldReturnFalse() {
        UserDetails validator = new UserDetails();
        boolean result = validator.validatePhoneNum("09 7644783990");
        Assert.assertTrue(result);
    }


}
